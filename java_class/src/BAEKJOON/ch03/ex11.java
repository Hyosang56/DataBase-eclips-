package BAEKJOON.ch03;

import java.io.*;
import java.util.StringTokenizer;

public class ex11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean run = true;
        while (run){
            String b = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(b);
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            if(c!=0 && d!=0){
                bufferedWriter.write(c+d+"\n");
            } else {
                run=false;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
