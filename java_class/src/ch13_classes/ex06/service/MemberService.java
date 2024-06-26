package ch13_classes.ex06.service;

import ch13_classes.ex06.common.Common;
import ch13_classes.ex06.dto.MemberDTO;
import ch13_classes.ex06.repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Common common = new Common();
    Scanner scanner = new Scanner(System.in);
    public void signup() {
        System.out.println("회원가입 메뉴");
        MemberDTO memberDTO = null;
        String memberEmail;
        do{
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            memberDTO = MemberRepository.emailCheck(memberEmail);
            if(memberDTO == null){
                System.out.println("사용가능한 이메일입니다.");
            } else {
                System.out.println("이미 사용중인 이메일입니다. 다시 입력해주십시오.");
            }
        }while (memberDTO != null);
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO1 = new MemberDTO(memberEmail,memberPassword,memberName,memberMobile);
        boolean result = memberRepository.signup(memberDTO1);
        if(result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }
    public void login() {
        MemberDTO memberDTO = null;
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        memberDTO = memberRepository.login(memberEmail,memberPassword);
        if(memberDTO != null){
            System.out.println("로그인 성공");
            System.out.println(memberDTO.getMemberName()+"님 환영합니다.");
            common.loginEmail(memberEmail);
        } else {
            System.out.println("이메일 또는 비밀번호가 틀렸습니다.");
        }
    }
    public void findAll() {
        List<MemberDTO> memberDTOList = MemberRepository.findAll();
        for (MemberDTO memberDTO: memberDTOList){
            System.out.println("memberDTO = " + memberDTO);
        }

    }
    public void update() {
        String loginEmail = common.loginCheck();
        if(loginEmail != null){
            System.out.print("변경할 전화번호: ");
            String memberMobile = scanner.next();
            boolean result = memberRepository.update(loginEmail, memberMobile);
            if(result){
                System.out.println("회원수정 완료");
            } else {
                System.out.println("회원수정 실패");
            }
        }else {
            System.out.println("로그인 하십시오.");
        }
    }
    public void delete() {
        String loginEmail = common.loginCheck();
        if(loginEmail != null) {
            boolean result = memberRepository.delete(loginEmail);
            if(result){
                System.out.println("회원탈퇴 성공");
                common.loginEmail(null);
                System.out.println("로그아웃되었습니다.");
            } else {
                System.out.println("회원탈퇴 실패");
            }
        }else {
            System.out.println("로그인 하십시오.");
        }
    }
    public void logout() {
        String loginEmail = common.loginCheck();
        if(loginEmail != null){
            common.loginEmail(null);
            System.out.println("로그아웃되었습니다.");
        } else {
            System.out.println("로그인 하십시오.");
        }
    }

}
