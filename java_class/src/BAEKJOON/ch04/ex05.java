package BAEKJOON.ch04;

import java.io.*;
import java.util.StringTokenizer;

public class ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i <m ; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int j1 = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int j = i1-1; j <j1 ; j++) {
                a[j] = k;
            }
        }
        for (int i = 0; i <n ; i++) {
            bw.write(a[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
