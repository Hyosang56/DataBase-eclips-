package BAEKJOON.ch07_two_dimension_alarray;

import java.io.*;
import java.util.StringTokenizer;

public class Ex03_length {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] a = new char[5][];
        int max = 0;
        for (int i = 0; i <5 ; i++) {
            String str = br.readLine();
            a[i] = new char[str.length()];
            for (int j = 0; j <str.length() ; j++) {
                a[i][j] = str.charAt(j);
            }
            if(str.length()>max){
                max = str.length();
            }
        }
        for (int i = 0; i <max ; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < a[j].length) {
                    bw.write(String.valueOf(a[j][i]));
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
