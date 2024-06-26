package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Member member = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("이메일: ");
                String memberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String memberPassword = scanner.next();
                System.out.print("이름: ");
                String memberName = scanner.next();
                System.out.print("전화번호: ");
                String memberMobile = scanner.next();
                member = new Member();
                member.setMemberEmail(memberEmail);
                member.setMemberPassword(memberPassword);
                member.setMemberName(memberName);
                member.setMemberMobile(memberMobile);
                System.out.println(member);
            } else if (selectNo == 2) {
                System.out.print("이메일: ");
                String memberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String memberPassword = scanner.next();
//                Member member = new Member();
                boolean loginResult = member.memberLogin(memberEmail, memberPassword);
                if (loginResult) {
                    System.out.println("로그인성공");
                } else {
                    System.out.println("이메일 또는 비밀번호가 틀립니다!");
                }
                System.out.println("member = " + member);
            } else if (selectNo == 3) {
                run = false;
            }
        }

    }
}

