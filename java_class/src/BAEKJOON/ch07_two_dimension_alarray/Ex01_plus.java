package BAEKJOON.ch07_two_dimension_alarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01_plus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];
        for (int i = 0; i <a.length ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <a.length ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
