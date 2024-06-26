package BAEKJOON.ch06_deep;

import java.io.*;
import java.util.StringTokenizer;

public class Ex02_chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = 1 - Integer.parseInt(st.nextToken());
        int q = 1 - Integer.parseInt(st.nextToken());
        int l = 2 - Integer.parseInt(st.nextToken());
        int b = 2 - Integer.parseInt(st.nextToken());
        int n = 2 - Integer.parseInt(st.nextToken());
        int p = 8 -Integer.parseInt(st.nextToken());
        bw.write(k+" "+q+" "+l+" "+b+" "+n+" "+p);
        bw.flush();
        br.close();
        bw.close();
    }
}
