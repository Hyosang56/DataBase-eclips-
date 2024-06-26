package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] numvers = null;
        int sum = 0;
        int temp = 0;
        double avg = 0;
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int num = scanner.nextInt();
            if(num == 1) {
                System.out.print("학생수> ");
                int student = scanner.nextInt();
                numvers = new int[student];
            }
            else if (num == 2 && numvers != null) {
                    System.out.println("1. 학생수입력 부터 해주십시오.");
                    for (int i = 0; i < numvers.length; i++) {
                        System.out.print((i + 1) + "번 학생 점수: ");
                        numvers[i] = scanner.nextInt();
                        sum += numvers[i];
                    }
            }
            else if (num == 3) {
                for (int i = 0; i < numvers.length ; i++) {
                    System.out.println((i+1)+"번 학생 점수: "+numvers[i]);
                }
            }
            else if (num == 4) {
                for (int i = 0; i < numvers.length ; i++) {
                    for (int j = i; j <numvers.length ; j++) {
                        if(numvers[i]<numvers[j]) {
                            temp = numvers[i];
                            numvers[i] = numvers[j];
                            numvers[j] = temp;
                    }
                    }
                }
                System.out.println("최고점수: "+numvers[0]);
                avg = (double) sum/numvers.length;
                System.out.println("평균점수: "+avg);
                for (int i = 0; i <numvers.length ; i++) {
                    System.out.println((i+1)+"등: "+numvers[i]);
                }
            }
            else if (num == 5) {
                System.out.println("종료되었습니다.");
                run = false;
            }
            else {
                System.out.println("1~5번을 입력해주세요.");
            }
        }
    }
}
