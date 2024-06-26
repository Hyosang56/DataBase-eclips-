package ch10_class.ex07;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Calcilator calcilator = new Calcilator();
        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("덧셈할 첫번째 정수 입력: ");
                int numa = scanner.nextInt();
                System.out.print("덧셈할 두번째 정수 입력: ");
                int numb = scanner.nextInt();
                calcilator.sum(numa, numb);
            }
            else if (selectNo == 2) {
                System.out.print("뺄셈할 첫번째 정수 입력: ");
                int numa = scanner.nextInt();
                System.out.print("뺄셈할 두번째 정수 입력: ");
                int numb = scanner.nextInt();
                calcilator.sub(numa, numb);
            }
            else if (selectNo == 3) {
                System.out.print("곱셈할 첫번째 정수 입력: ");
                int numa = scanner.nextInt();
                System.out.print("곱셈할 두번째 정수 입력: ");
                int numb = scanner.nextInt();
                int result = calcilator.mul(numa, numb);
                System.out.println("mul: " + result);
            }
            else if (selectNo == 4) {
                int result1 = calcilator.div();
                System.out.println("div: " + result1);
            }
            else if (selectNo == 5) {
                run = false;
                System.out.println("종료되었습니다.");
            }
            else {
                System.out.println("1~5까지 입력해주세요.");
            }
        }
    }
}
