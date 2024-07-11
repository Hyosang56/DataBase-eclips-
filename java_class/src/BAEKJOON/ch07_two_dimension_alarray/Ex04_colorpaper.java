package BAEKJOON.ch07_two_dimension_alarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex04_colorpaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i <n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x-1; j <x+9 ; j++) {
                for (int k = y-1; k <y+9 ; k++) {
                    if(a[j][k] == 0){
                        a[j][k] = 1;
                    }
                }
            }
        }
        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j < 100; j++) {
                if(a[i][j]==1){
                    count +=1;
                }
            }
        }
        System.out.println(count);
    }
}
