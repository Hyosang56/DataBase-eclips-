package BAEKJOON.ch04;

import java.io.*;
import java.util.StringTokenizer;

public class ex06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = i+1;
        }
        for (int i = 0; i <m ; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int j1 = Integer.parseInt(st.nextToken());
            int k = a[i1-1];
            a[i1-1] = a[j1-1];
            a[j1-1] = k;
        }
        for (int i = 0; i <n ; i++) {
            bw.write(a[i]+" ");
        }
        bw.flush();
        bw.close();
    }
    }

