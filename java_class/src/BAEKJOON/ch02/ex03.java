package BAEKJOON.ch02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 4 == 0){
            if (num % 100 != 0) {
                System.out.println("1");
            }
            else if (num % 400 == 0) {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        else {
            System.out.println("0");
        }
    }
}
