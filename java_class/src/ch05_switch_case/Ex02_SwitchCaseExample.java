package ch05_switch_case;

import java.util.Scanner;

public class Ex02_SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어사전에 입력: ");
        String dictionary = scanner.next();
        switch (dictionary) {
            case "desk":
                System.out.println("desk(책상)");
                break;
            case "chair":
                System.out.println("chair(의자)");
                break;
            case "monitor":
                System.out.println("monitor(모니터)");
                break;
            case "mouse":
                System.out.println("mouse(마우스)");
                break;
            default :
                System.out.println("사전에 없는 단어 입니다.");
                break;
        }
    }
}
