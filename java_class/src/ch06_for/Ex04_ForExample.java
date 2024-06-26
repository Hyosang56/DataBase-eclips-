package ch06_for;

import java.util.Scanner;

public class Ex04_ForExample {
    public static void main(String[] args) {
        /**
         * 두개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
         * 실행 화면
         * 시작값: 10
         * 끝값: 100
         * 10부터 100까지의 합은 000 입니다.
         * 10+11+12+~~~~~~~+100=000
         */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("시작값: ");
        int num1 = scanner.nextInt();
        System.out.print("끝값: ");
        int num2 = scanner.nextInt();
        for (int i = num1; i<= num2; i++) {
            sum += i;
        }
        System.out.println(num1+"부터 "+ num2+"까지의 합은 "+ sum +" 입니다.");

        for (int i = num1; i <= num2; i++){
            if (i < num2) {
                System.out.print(i + "+");
            } else {
                System.out.println(i + "=" + sum);
            }
        }
    }
}
