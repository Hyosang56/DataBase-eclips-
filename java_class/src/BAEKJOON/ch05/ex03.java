package BAEKJOON.ch05;

import java.io.*;

public class ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int a = s.length();
            bw.write(s.charAt(0)+""+s.charAt(a-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
