package ch02_operator;

public class Ex03_AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 3;
		System.out.println("num1: "+num1 + " num2: "+num2); //num1: 5, num2: 3
		num1 += num2; // num1= num1 + num2
		System.out.println("num1: "+num1 + " num2: "+num2); // num1: 8, num2: 3
		num1 -= num2; // num1= num1 - num2
		System.out.println("num1: "+num1 + " num2: "+num2); // num1: 5, num2: 3
		num1 *= num2; // num1= num1 * num2
		System.out.println("num1: "+num1 + " num2: "+num2); // num1: 15, num2: 3
		num1 /= num2; // num1= num1 / num2
		System.out.println("num1: "+num1 + " num2: "+num2); // num1: 5, num2: 3
		num1 %= num2; // num1= num1 % num2
		System.out.println("num1: "+num1 + " num2: "+num2); // num1: 2, num2: 3

	}

}
