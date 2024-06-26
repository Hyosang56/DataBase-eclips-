package BAEKJOON.ch02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        b-=45;
        if(a>0 && b<0){
            a -= 1;
            b = 60+b;
        } else if (a == 0 && b<0) {
            a = 23;
            b = 60+b;
        }
        System.out.println(a+" "+b);
    }
}
