package BAEKJOON.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class ex07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <=a ; i++) {
            String b = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(b);
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write("Case #"+i+": "+(c+d)+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

