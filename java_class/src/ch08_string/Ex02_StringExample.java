package ch08_string;

import java.util.Scanner;

public class Ex02_StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        System.out.println("메시지를 입력하세요\n프로그램을 종료하려면 '종료'를 입력하세요.");
        //String answer = "종료";
        final String ANSWER = "종료";
        //ANSWER = "ㅁㅁ";

        while (run) {
            System.out.print(">");
            String a = scanner.nextLine();
            if (a.equals("종료")){
                System.out.println(a);
                run = false;
            }  else {
                System.out.println(a);
            }
        }
    }
}
