package BAEKJOON.ch09_divisor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex02_divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result, count = 0;
        boolean run = true;
        while (run){
            for (int i = 1; i <=n ; i++) {
                if(n%i == 0){
                    result = i;
                    count++;
                    if(count == k){
                        System.out.println(result);
                        run = false;
                    }
                }
            }
            if(count < k){
                System.out.println("0");
                run = false;
            }

        }
    }
}
