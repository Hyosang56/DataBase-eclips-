package BAEKJOON.ch08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int count = 1;
        n = n - 1;
        while(n>0){
            a +=6;
            n= n - a;
            count +=1;
        }
        System.out.println(count);
    }
}
