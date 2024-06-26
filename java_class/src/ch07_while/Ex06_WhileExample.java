package ch07_while;

import java.util.Scanner;

public class Ex06_WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();
            if (num != 0){
                sum += num;
                cnt++;
            } else {
                break;
            }
        }
        System.out.println("avg1 = "+(sum/cnt));
        double avg2 = sum/cnt;
        System.out.println("avg2 = "+avg2);
        double avg3 = (double) sum/cnt;
        System.out.println("avg3 = " + avg3);
    }
}
