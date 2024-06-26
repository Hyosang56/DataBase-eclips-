package BAEKJOON.ch06_deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String i: croatia ){
            if(str.contains(i)){
                str=str.replace(i,"A");
            }
        }
        System.out.println(str.length());
    }
}

