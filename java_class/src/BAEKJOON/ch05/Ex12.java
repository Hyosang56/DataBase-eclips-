package BAEKJOON.ch05;

import java.io.*;

public class Ex12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while((input = br.readLine()) != null) {
            bw.write(input);
            bw.newLine();
        }
//        while((input = br.readLine()) != null && !input.isEmpty()) {
//            bw.write(input);
//            bw.newLine();
//        }
        bw.flush();
        bw.close();
    }
}
