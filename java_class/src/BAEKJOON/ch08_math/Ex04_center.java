package BAEKJOON.ch08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_center {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 2;
        int b = 1;
        double num = 4;
        for (int i = 0; i <n ; i++) {
            a += b;
            num = Math.pow(a, 2);
            b *= 2;
        }
        System.out.println((int)num);
    }
}
