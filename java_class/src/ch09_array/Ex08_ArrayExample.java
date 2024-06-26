package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayExample {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 정수만큼의 크기를 갖는 배열 만들기
         * 5를 입력하면 크기가 5인 배열이 생성되어야 함
         */
        System.out.print("배열 크기 입력: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numvers = new int[num];
        System.out.println("배열의 크기는 "+numvers.length);


    }
}
