package BAEKJOON.ch05;

import java.io.*;

public class ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int a = Integer.parseInt(br.readLine());
        bw.write(s.charAt(a-1));
        bw.flush();
        bw.close();
    }
}
