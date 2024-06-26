package BAEKJOON.ch05;

import java.io.*;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s =br.readLine();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j",
                "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(String a: alphabet){
            bw.write(s.indexOf(a)+" ");
        }
        bw.flush();
        bw.close();
    }
}
