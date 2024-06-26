package ch07_while;

import java.util.Scanner;

public class Ex07_WhileExample {
    public static void main(String[] args) {
        /**
         * 1 + (-2) + 3 ......
         * 합계가 100이될때의 숫자를 출력
         * 정답: 199
         */
        int sum = 0;
        int num = 0;
        while (true) {
            num++;
            if (num%2 == 0) {
                System.out.print("(-"+num+")");
                sum -= num;
            }
            else {
                System.out.print(num);
                sum += num;
            }
            if (sum == 100) {
                System.out.println("\n정답: " + num);
                break;
            }
            System.out.print(" + ");
        }
    }
}
