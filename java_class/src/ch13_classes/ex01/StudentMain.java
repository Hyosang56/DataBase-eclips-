package ch13_classes.ex01;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // StudentService 클래스 객체 선언
        StudentService studentService = new StudentService();

        while(run) {
            System.out.println("----------------------------------------------");
            System.out.println("1. method1호출 | 2.method2호출 | 3.method3호출 | 4.method4호출 | 5.method5호출");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                //studentService 클래스가 가지고 있는 mothod1 호출
                System.out.println("메서트 호출 전");
                studentService.method1();
                System.out.println("메서트 호출 후");
            } else if (selectNo == 2) {
                studentService.method2();
            } else if (selectNo == 3) {
                studentService.method3();
            } else if (selectNo == 4) {
                studentService.method4();

            } else if (selectNo == 5) {
                studentService.method5();
            }
        }
    }
}
