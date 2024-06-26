package BAEKJOON.ch03;

import java.io.*;

public class ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <=a ; i++) {
            int b = a-i;
            for (int t = 0; t <b ; t++) {
                bufferedWriter.write(" ");
            }
            for (int j = 0; j <i ; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
