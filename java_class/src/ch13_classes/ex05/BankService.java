package ch13_classes.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);

    public void account() {
        boolean check;
        String accountNumber = null;
        do {
            System.out.print("계좌등록) 계좌번호 입력: ");
            accountNumber = scanner.next();
            check = bankRepository.accountCheck(accountNumber);
            if(!check){
                System.out.println("중복된 계좌번호 입니다.");
            }
        } while(!check);
        System.out.print("계좌등록) 이름 입력: ");
        String clientName = scanner.next();
        System.out.print("계좌등록) 계좌 비밀번호 입력: ");
        String clientPass = scanner.next();

        ClientDTO clientDTO = new ClientDTO(clientName,accountNumber,clientPass);
        boolean result = bankRepository.account(clientDTO);
        if(result) {
            System.out.println("계좌등록 성공");
        } else {
            System.out.println("계좌등록 실패");
        }
    }
    public void balance() {
        System.out.print("잔액조회) 계좌번호 입력: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.balance(accountNumber);
        if(clientDTO != null){
            System.out.println("clientDTO.getBalance() = " + clientDTO.getBalance());
        } else {
            System.out.println("없는 계좌번호입니다.");
        }
    }
    public void deposit() {
        String accountNumber;
        boolean check;
        do {
            System.out.print("입금) 계좌번호 입력: ");
            accountNumber = scanner.next();
            check = bankRepository.accountCheck(accountNumber);
            if(check){
                System.out.println("없는 계좌번호 입니다.");
            }
        } while(check);
        System.out.print("입금) 금액 입력: ");
        long deposit = scanner.nextLong();
        boolean result = bankRepository.deposit(accountNumber,deposit);
        if(result) {
            System.out.println("입금 성공");
        } else {
            System.out.println("입금 실패");
        }

    }
    public void withdraw() {
        String accountNumber;
        boolean check;
        do {
            System.out.print("입금) 계좌번호 입력: ");
            accountNumber = scanner.next();
            check = bankRepository.accountCheck(accountNumber);
            if(check){
                System.out.println("없는 계좌번호 입니다.");
            }
        } while(check);
        System.out.print("출금) 계좌 비밀번호 입력: ");
        String clientPass = scanner.next();
        System.out.print("출금) 금액 입력: ");
        long withdraw = scanner.nextLong();
        boolean result = bankRepository.withdraw(accountNumber,clientPass,withdraw);
        if(result) {
            System.out.println("출금 성공");
        } else {
            System.out.println("출금 실패");
        }
    }
    public void findAll() {
        String accountNumber;
        boolean check;
        boolean run = true;
        do {
            System.out.print("입출금내역조회) 계좌번호 입력: ");
            accountNumber = scanner.next();
            check = bankRepository.accountCheck(accountNumber);
            if(check){
                System.out.println("없는 계좌번호 입니다.");
            }
        } while(check);
        List<AccountDTO> accountDTOList = bankRepository.findAll(accountNumber);
        while (run){
            System.out.println("-----------------------------------------------");
            System.out.println("1.전체내역 | 2.입금내역 | 3.출금내역 | 4.종료메뉴");
            System.out.println("-----------------------------------------------");
            System.out.print("입력: ");
            int selectCh = scanner.nextInt();
            if(selectCh == 1) {
                for (AccountDTO accountDTO:accountDTOList){
                    System.out.println("전체내역: "+accountDTO);
                }
            } else if(selectCh == 2) {
                for (AccountDTO accountDTO: accountDTOList) {
                    if(accountDTO.getDeposit() > 0) {
                        System.out.println("입금내역 = " + accountDTO);
                    }
                }
            } else if (selectCh ==3) {
                for (AccountDTO accountDTO: accountDTOList) {
                    if(accountDTO.getWithdraw() > 0) {
                        System.out.println("출금내역 = " + accountDTO);
                    }
                }
            } else if (selectCh ==4) {
                System.out.println("종료되었습니다.");
                run = false;
            }
        }
    }
    public void accountTransfer() {
        String numberA;
        boolean check;
        do {
            System.out.print("보내시는분 계좌번호: ");
            numberA = scanner.next();
            check = bankRepository.accountCheck(numberA);
            if (check) {
                System.out.println("없는 계좌번호 입니다.");
            }
        } while (check);
        System.out.print("받으실분 계좌번호: ");
        String numberB = scanner.next();
        System.out.print("보낼금액: ");
        long money = scanner.nextLong();
        boolean result = bankRepository.accountTrasfer(numberA, numberB, money);
        if (result) {
            System.out.println("이체가 완료되었습니다,");
        } else {
            System.out.println("이체 실패");
        }
    }
}

