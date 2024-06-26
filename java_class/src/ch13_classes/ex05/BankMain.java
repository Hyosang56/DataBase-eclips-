package ch13_classes.ex05;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectNo;
        boolean run = true;
        BankService bankService = new BankService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.신규계좌 등록 | 2.잔액 조회 | 3.입금 | 4.출금 | 5.입출금 내역 조회 | 6.계좌이체 | 7.종료");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("입력: ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                bankService.account();
            } else if (selectNo == 2) {
                bankService.balance();
            } else if (selectNo == 3) {
                bankService.deposit();
            } else if (selectNo == 4) {
                bankService.withdraw();
            } else if (selectNo == 5){
                bankService.findAll();
            } else if (selectNo == 6){
                bankService.accountTransfer();
            } else if (selectNo == 7){
                run = false;
                System.out.println("종료되었습니다.");
            }
        }
    }
}