package BAEKJOON.ch03;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <10 ; i++) {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
