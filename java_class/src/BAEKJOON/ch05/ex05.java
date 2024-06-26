package BAEKJOON.ch05;

import java.io.*;

public class ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum += Character.getNumericValue(a.charAt(i));
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
