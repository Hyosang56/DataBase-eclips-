package BAEKJOON.ch07_two_dimension_alarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex02_maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1; //0으로 하면 0이랑 비교할때 비교가 안될수도 있어 음수로 설정
        int m = 0;
        int n = 0;
        int[][] a = new int[9][9] ;
        for (int i = 0; i <9 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <9 ; j++) {
                int int1 = Integer.parseInt(st.nextToken());
                a[i][j] = int1;
                if(int1 > max){
                    max = int1;
                    m = i+1;
                    n= j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(m +" "+ n);
    }
}
