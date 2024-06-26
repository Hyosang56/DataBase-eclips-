package ch13_classes.ex07;
import ch13_classes.ex07.common.Common;
import ch13_classes.ex07.service.BoardService;
import ch13_classes.ex07.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectNo;
        boolean run = true;
        int selectNo2;
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        Common common = new Common();
        while (run) {
            System.out.println("===== 회원관리 =====");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택: ");
            selectNo = scanner.nextInt();
            if(selectNo == 1) {
                memberService.signup();
            } else if(selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3){
                memberService.findAll();
            } else if (selectNo == 4){
                memberService.update();
            } else if (selectNo == 5){
                memberService.delete();
            } else if (selectNo == 6){
                memberService.logout();
            } else if (selectNo == 7) {
                String loginEmail = common.loginCheck();
                boolean run2 = true;
                if(loginEmail != null){
                    while (run2) {
                        System.out.println("===== 게시글 =====");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.종료");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.print("선택: ");
                        selectNo2 = scanner.nextInt();
                        if (selectNo2 == 1) {
                            boardService.write(loginEmail);
                        } else if (selectNo2 == 2) {
                            boardService.findAll();
                        } else if (selectNo2 == 3) {
                            boardService.findWriting(loginEmail);
                        } else if (selectNo2 == 4) {
                            boardService.update(loginEmail);
                        } else if (selectNo2 == 5) {
                            boardService.delete(loginEmail);
                        } else if (selectNo2 == 6) {
                            boardService.search();
                        } else if (selectNo2 == 99) {
                            boardService.sample(loginEmail);
                        } else if (selectNo2 == 0) {
                            run2 = false;
                            System.out.println("메인메뉴");
                        }
                    }
                }else {
                    System.out.println("회원전용 메뉴입니다.");
                }
            } else if (selectNo == 0) {
                System.out.println("종료되었습니다.");
                run = false;
            } else {
                System.out.println("잘못입력하셨습니다. 0~7까지 다시 입력해주십시오.");
            }
        }
    }
}
