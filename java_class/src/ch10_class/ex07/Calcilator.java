package ch10_class.ex07;

import java.util.Scanner;

public class Calcilator {

    /**
     * 덧셈 메서드
     * method name: sum
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 합을 출력
     */
    public void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    /**
     * 뺄셈 메서드
     * method name: sub
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 차를 출력
     */
    public void sub(int num1, int num2) {
        System.out.println("sub: " + (num1 - num2));
    }

    /**
     * 곱셈 메서드
     * method name: mul
     * parameter: int 타입 2개
     * return: int 타입
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 곱 결과를 리턴
     */
    public int mul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    /**
     * 나눗셈 메서드
     * method name: div
     * parameter: 없음
     * return: int 타입
     * 실행내용
     *  - 메서드 내부에서 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     *  - 나눗셈 결과를 리턴
     */
    public int div() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나눗셈할 첫번째 정수 입력: ");
        int num1 = scanner.nextInt();
        System.out.print("나눗셈할 두번째 정수 입력: ");
        int num2 = scanner.nextInt();
        int div = num1/num2;
        return div;
    }
}


