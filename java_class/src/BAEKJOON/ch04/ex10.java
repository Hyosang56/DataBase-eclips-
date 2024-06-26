package BAEKJOON.ch04;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        float[] a = new float[n];
        float sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            a[i] = Float.parseFloat(st.nextToken());
        }
        Arrays.sort(a);
        for (int i = 0; i <n ; i++) {
            a[i] = a[i]/a[n-1]*100;
            sum += a[i];
        }
        bw.newLine();
        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();

    }
}
