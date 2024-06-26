package Ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학년을 입력: ");
        int year = scanner.nextInt();
        System.out.print("점수를 입력: ");
        int score = scanner.nextInt();
        if (year < 4) {
            if (score >= 60 ) {
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        } else {
            if (score >= 70 ) {
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        }
    }
}
