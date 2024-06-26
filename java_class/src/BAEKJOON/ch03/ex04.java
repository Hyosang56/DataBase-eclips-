package BAEKJOON.ch03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int a = scanner.nextInt();
        int sum2 = 0;
        for (int i = 0; i <a ; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            sum2 += b*c;
        }
        if(sum == sum2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
