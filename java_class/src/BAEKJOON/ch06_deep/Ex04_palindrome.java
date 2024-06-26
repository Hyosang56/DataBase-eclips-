package BAEKJOON.ch06_deep;

import java.io.*;

public class Ex04_palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int count = 1;
        for (int k = 0; k < s.length()/2; k++) {
            if(s.charAt(k) != s.charAt(s.length()-1-k)){
                count = 0;
        }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
