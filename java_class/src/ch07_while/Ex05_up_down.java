package ch07_while;

import java.util.Scanner;

public class Ex05_up_down {
    public static void main(String[] args) {

        int ran = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            System.out.print("숫자를 입력하세요:");
            int num = scanner.nextInt();
            cnt += 1;
            if (num > ran) {
                System.out.println("더 작은 수를 입력하세요!");
            } else if (num < ran) {
                System.out.println("더 큰 수를 입력하세요!");
            } else {
                System.out.println("맞았습니다!");
                System.out.println("시도 횟수는 "+cnt+"회 입니다." );
                break;
            }
        }
    }
}
