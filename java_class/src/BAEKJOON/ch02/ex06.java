package BAEKJOON.ch02;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        a += (b+c)/60;
        b = (b+c)%60;
        if(a>23){
            a -= 24;
        }
        System.out.println(a+" "+b);
    }
}
