package BAEKJOON.ch04;

import java.io.*;
import java.util.StringTokenizer;

public class ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count= 0;
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for (int i = 0; i <n ; i++) {
            if(a[i] == v){
                count += 1;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
