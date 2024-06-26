package ch13_classes.ex03;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectNo = 0;
        boolean run = true;
        MemberService memberService = new MemberService();
        while (run) {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원 목록조회 | 4. 회원 정보수정 | 5.회원탈퇴 | 6.로그아웃 | 7. 종료 ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.signUp();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.findALl();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
                run = false;
            }
        }
    }
}
