package Ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String grade = "";
        System.out.print("점수 입력: ");
        int score = scanner.nextInt();
        if (score>=0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            System.out.println("입력범위를 초과하였습니다.");
        }
        System.out.println(grade);
    }
}
