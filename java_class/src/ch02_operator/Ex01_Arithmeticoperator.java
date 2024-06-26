package ch02_operator;

public class Ex01_Arithmeticoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 두 개의 정수형 변수 num1, num2를 선언하고
		 * 두 변수의 +, -, *, /, % 연산결과를 println() 을 활용하여 출력
		 * 출력 방법
		 * System.out.println(num1 + num2);
		 */

		int num1 = 5;
		int num2 = 3;
		System.out.println("덧셈결과"+ num1 + num2 ); 
		System.out.println("덧셈결과"+ (num1 + num2) );
		System.out.println(num1 - num2); //2
		System.out.println(num1 * num2); //15
		System.out.println(num1 / num2); //1
		System.out.println(num1 % num2); //2
		
		
		//계산 결과를 담을 변수 활용
		int result = 0;
		// num1+num2의 결과를 result에 저장
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
		
		
		
	}

}
