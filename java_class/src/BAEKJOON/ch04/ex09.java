package BAEKJOON.ch04;

import java.io.*;
import java.util.StringTokenizer;

public class ex09 {
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
            int i1 = Integer.parseInt(st.nextToken())-1;
            int j1 = Integer.parseInt(st.nextToken())-1;
            while (i1 < j1){
                int temp = a[i1];
                a[i1] = a[j1];
                a[j1] = temp;
                i1 +=1;
                j1 -=1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            bw.write(a[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
