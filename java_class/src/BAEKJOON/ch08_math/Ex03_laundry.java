package BAEKJOON.ch08_math;

import java.util.Scanner;

public class Ex03_laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int c = sc.nextInt();
            int[] a = new int[4];
            boolean run = true;
            while(run){
                if(c>=25){
                    a[0]= c/25;
                    c = c%25;
                } else if (c>=10) {
                    a[1] = c/10;
                    c = c%10;
                } else if (c>=5) {
                    a[2] = c/5;
                    c = c%5;
                } else if (c>=1) {
                    a[3] = c;
                    run = false;
                } else {
                    run = false;
                }
            }
            for (int j = 0; j <a.length ; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
