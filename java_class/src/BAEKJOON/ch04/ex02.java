package BAEKJOON.ch04;

import java.io.*;
import java.util.StringTokenizer;

public class ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <n ; i++) {
            if (a[i] < x ) {
                bw.write(Integer.toString(a[i]));
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
