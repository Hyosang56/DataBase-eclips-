package BAEKJOON.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class ex12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String b = "";
        while ((b=bufferedReader.readLine()) != null && !b.isEmpty()) {

            StringTokenizer stringTokenizer = new StringTokenizer(b);
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(c + d + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
