package ch13_classes.ex03;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;

    public void signUp() {
        // 이메일 중복체크 결과용 변수
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.print("회원가입) 아이디 입력: ");
            memberEmail = scanner.next();
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult)
                System.out.println("사용 가능한 이메일 입니다.");
            else
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
        } while(!checkResult);
        System.out.print("회원가입) 비밀번호 입력: ");
        String memberPassword = scanner.next();
        System.out.print("회원가입) 이름 입력: ");
        String memberName = scanner.next();
        System.out.print("회원가입) 전화번호 입력: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail,memberPassword,memberName,memberMobile);
        boolean result = memberRepository.signup(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }
    public void login() {
        System.out.print("로그인) 아이디 입력: ");
        String memberEmail = scanner.next();
        System.out.print("로그인) 비밀번호 입력: ");
        String memberPassword = scanner.next();
        boolean result = memberRepository.login(memberEmail, memberPassword);
        if(result) {
            System.out.println("로그인 성공");
            loginEmail = memberEmail;
        } else {
            System.out.println("로그인 실패");
        }
    }
    public void findALl() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for(MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }
    public void update() {
        if (loginEmail != null) {
            System.out.print("변경할 전화번호 입력: ");
            String memberMobile = scanner.next();
            boolean result = memberRepository.update(loginEmail, memberMobile);
            if(result) {
                System.out.println("변경 성공");
            }else {
                System.out.println("변경 실패");
            }
        } else {
            System.out.println("로그인 하세요");
        }

    }

    public void delete() {
        if(loginEmail != null) {
            System.out.print("비밀번호 입력: ");
            String memberPassword = scanner.next();
            boolean result = memberRepository.delete(memberPassword);
            if(result) {
                System.out.println("회원 탈퇴되었습니다.");
                loginEmail = null;
            } else {
                System.out.println("비밀번호를 틀렸습니다.");
            }
        } else {
            System.out.println("로그인 하세요");
        }
    }
    public void logout() {
        loginEmail = null;
        System.out.println("로그아웃되었습니다.");
    }
}
