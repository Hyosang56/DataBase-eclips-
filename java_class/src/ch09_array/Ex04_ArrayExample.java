package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayExample {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8} ;
        /**
         * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */
        Scanner scnner = new Scanner(System.in);
        System.out.print("1~10중에서 하나 입력: ");
        int num2 = scnner.nextInt();
        for (int i = 0; i < num.length ; i++) {
            if (num[i] == num2) {
                System.out.println(i+" 번 인덱스에 위치해 있습니다.");
            }
        }
    }
}



