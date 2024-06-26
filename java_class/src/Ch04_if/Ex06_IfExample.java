package Ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {
    public static void main(String[] args) {
        /**
         * 정수 하나를 입력받아서
         * 3의 배수인지, 5의 배수인지 또는 3과5의 공배수인지, 아무것도 아닌지 출력
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num1 = scanner.nextInt();
        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("3과 5의 공배수입니다.");
        } else if (num1 % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        } else if (num1 % 5 == 0) {
            System.out.println("5의 배수 입니다.");

        } else {
            System.out.println("아무것도 아닙니다.");
        }
    }
}
