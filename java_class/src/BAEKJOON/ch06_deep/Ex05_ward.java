package BAEKJOON.ch06_deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_ward {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ward = br.readLine().toUpperCase();
        int[] count = new int[26];
        for (int i = 0; i < ward.length() ; i++) {
            int num = ward.charAt(i)-'A';
            count[num]++;
        }
        int max = 0;
        char ch = '?';
        for (int i = 0; i < count.length ; i++) {
            if(count[i] > max){
                max = count[i];
                ch = (char)(i+'A');
            } else if (count[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
