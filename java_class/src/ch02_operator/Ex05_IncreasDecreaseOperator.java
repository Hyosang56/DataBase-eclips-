package ch02_operator;

public class Ex05_IncreasDecreaseOperator {

	public static void main(String[] args) {
		//증강연산자
		int num1 = 10, num2 = 0, num3 = 0;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 10, num2: 0, num3: 0
		num2 = ++num1;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 11, num2: 11, num3: 0
		num3 = num1++;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 12, num2: 11, num3: 11
		num3 = ++num1 + ++num2;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 13, num2: 12, num3: 25
		num3 = num1-- + ++num2;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 12, num2: 13, num3: 26
		num3 = num1++ - --num2;
		System.out.println("num1: "+num1 + ", num2: "+num2 + ", num3: "+num3); //num1: 13, num2: 12, num3: 0

	}

}
