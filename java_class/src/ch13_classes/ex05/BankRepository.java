package ch13_classes.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankRepository {
    public static List<ClientDTO> clientList = new ArrayList<>();
    private static List<AccountDTO> bankingList = new ArrayList<>();
    private static long clientId = 1L;
    Scanner scanner = new Scanner(System.in);
    LocalDateTime now = LocalDateTime.now();

    public boolean accountCheck(String accountNumber) {
        boolean result = true;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                result = false;
            }
        }
        return result;
    }

    public boolean account(ClientDTO clientDTO) {
        clientDTO.setId(clientId++);
        String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        clientDTO.setClientCreatedAt(createdAt);
        return clientList.add(clientDTO);
    }

    public ClientDTO balance(String accountNumber) {
        ClientDTO clientDTO = new ClientDTO();
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                clientDTO.setBalance(clientList.get(i).getBalance());
                return clientDTO;
            }
        }
        return null;
    }

    public boolean deposit(String accountNumber, long deposit) {
        AccountDTO accountDTO = new AccountDTO();
        boolean result = false;
        long balance = 0L;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                balance = clientList.get(i).getBalance();
                balance += deposit;
                clientList.get(i).setBalance(balance);
                accountDTO.setId(clientList.get(i).getId());
                accountDTO.setAccountNumber(clientList.get(i).getAccountNumber());
                accountDTO.setDeposit(deposit);
                String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                accountDTO.setBankingAt(createdAt);
                bankingList.add(accountDTO);
                result = true;
            }
        }
        return result;
    }

    public boolean accountNumberCheck(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }
    public boolean withdraw(String accountNumber, String clientPass, long withdraw) {
        boolean result = false;
        long balance = 0L;
        AccountDTO accountDTO = new AccountDTO();
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                if(clientPass.equals(clientList.get(i).getClientPass())){
                    if(clientList.get(i).getBalance() > withdraw){
                        balance = clientList.get(i).getBalance();
                        balance -= withdraw;
                        clientList.get(i).setBalance(balance);
                        accountDTO.setId(clientList.get(i).getId());
                        accountDTO.setAccountNumber(clientList.get(i).getAccountNumber());
                        accountDTO.setWithdraw(withdraw);
                        String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        accountDTO.setBankingAt(createdAt);
                        bankingList.add(accountDTO);
                        result = true;
                        
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else {
                    System.out.println("계좌 비밀번호가 틀렸습니다.");
                }
            }
        }
        return result;
    }
    public List<AccountDTO> findAll(String accountNumber) {
        List<AccountDTO> accountDTOList = new ArrayList<>();
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())) {
                accountDTOList.add(bankingList.get(i));
            }
        }
        return accountDTOList;
    }
    public boolean accountTrasfer(String numberA, String numberB, long money) {
        ClientDTO clientDTO = new ClientDTO();
        long balance = 0L;
        boolean result = false;
        for (int i = 0; i <clientList.size() ; i++) {
            if (numberB.equals(clientList.get(i).getAccountNumber())) {
                    clientDTO.setClientName(clientList.get(i).getClientName());
            }
        }
        System.out.println("받으실 분이 고객"+clientDTO.getClientName()+"님이 맞습니까?");
        System.out.println("맞으면 1번, 틀리면 2번을 입력해주세요.");
        System.out.print("입력: ");
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.print("비밀번호를 입력: ");
            String password = scanner.next();
            for (int i = 0; i <clientList.size() ; i++) {
                if(numberA.equals(clientList.get(i).getAccountNumber()) && password.equals(clientList.get(i).getClientPass())){
                    AccountDTO accountDTO = new AccountDTO();
                    balance = clientList.get(i).getBalance();
                    balance -= money;
                    clientList.get(i).setBalance(balance);
                    accountDTO.setId(clientList.get(i).getId());
                    accountDTO.setAccountNumber(clientList.get(i).getAccountNumber());
                    accountDTO.setWithdraw(money);
                    String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    accountDTO.setBankingAt(createdAt);
                    bankingList.add(accountDTO);
                    result = true;
                }
            }
            for (int i = 0; i < clientList.size(); i++) {
                if(numberB.equals(clientList.get(i).getAccountNumber())) {
                    AccountDTO accountDTO = new AccountDTO();
                    balance = clientList.get(i).getBalance();
                    balance += money;
                    clientList.get(i).setBalance(balance);
                    accountDTO.setId(clientList.get(i).getId());
                    accountDTO.setAccountNumber(clientList.get(i).getAccountNumber());
                    accountDTO.setDeposit(money);
                    String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    accountDTO.setBankingAt(createdAt);
                    bankingList.add(accountDTO);
                }
            }
        }
        return result;
    }

}

