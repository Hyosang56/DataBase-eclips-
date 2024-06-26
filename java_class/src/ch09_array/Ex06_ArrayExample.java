package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayExample {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int big = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("배열에 들어갈 정수 입력: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] > big) {
                big = numbers[i];
            }
        }
        System.out.println("입력된 값 중에서 가장 큰 값: "+big);
    }
}
