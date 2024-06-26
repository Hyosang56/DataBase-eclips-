package BAEKJOON.ch03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 4;
        for (int i = 0; i <b ; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
