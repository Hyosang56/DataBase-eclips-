package BAEKJOON.ch04;

import java.io.*;

public class ex08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int cnt = 0;
        for (int i = 0; i <10 ; i++) {
            boolean result = true;
            int b = Integer.parseInt(br.readLine());
            for (int j = 0; j <=i ; j++) {
                if(a[j] == b%42){
                    result = false;
                }
            }
            if(result){
                a[i] = b%42;
                cnt += 1;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
