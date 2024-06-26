package BAEKJOON.ch05;

import java.io.*;

public class ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        byte num = (byte)br.readLine().charAt(0);
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
    }

}
