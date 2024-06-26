package ch07_while;

import java.util.Scanner;

public class Ex08_WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bank = 0;
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("입금액> ");
                int in = scanner.nextInt();
                bank += in;
                System.out.println("입금이 완료되었습니다.");
                System.out.println("현재잔액은 "+bank+"원 입니다.");
            } else if (choice == 2) {
                System.out.print("출금액> ");
                int out = scanner.nextInt();
                if (out <= bank) {
                    bank -= out;
                    System.out.println("출금이 완료되었습니다.");
                    System.out.println("현재잔액은 "+bank+"원 입니다.");
                } else {
                    System.out.println("잔고가 부족합니다.");
                    System.out.println("현재잔액은 "+bank+"원 입니다.");
                }
            } else if (choice == 3) {
                System.out.println("현재잔액은 "+bank+"원 입니다.");
            } else if (choice == 4) {
                System.out.println("종료 되었습니다.");
                break;
            }
            else {
                System.out.println("다시 선택");
            }
        }
    }
}
