package BAEKJOON.ch04;

import java.io.*;

public class ex07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[28];
        for (int i = 0; i <28 ; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <31 ; i++) {
            boolean b = true;
            for (int j = 0; j <28 ; j++) {
                if(i == a[j]){
                    b = false;
                }
            }
            if(b){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
