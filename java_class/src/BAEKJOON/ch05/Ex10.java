package BAEKJOON.ch05;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        if(a>b){
            bw.write(String.valueOf(a));
        } else{
            bw.write(String.valueOf(b));
        }
        bw.flush();
        bw.close();
    }
}
