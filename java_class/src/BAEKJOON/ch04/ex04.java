package BAEKJOON.ch04;

import java.io.*;

public class ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int turn = 0;
        for (int i = 1; i <10 ; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a > max){
                max = a;
                turn = i;
            }
        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(turn));
        bw.flush();
        bw.close();
    }
}
