package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		 * 스캐너로 정수 2개를 각각 입력받고 입력받은 수의 합계 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = scan.nextInt();
		System.out.println("두 수의 합은: "+(num1 + num2));
		

	}

}
