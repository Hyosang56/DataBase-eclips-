package ch02_operator;

public class Ex04_LogicalOperator {

	public static void main(String[] args) {
		boolean bool1 = true, bool2 = false;
		// AND 연산
		System.out.println((bool1 && bool2)); //false
		System.out.println((bool1 && 10==20)); //false
		System.out.println((bool2 && bool1)); //false
		System.out.println((false && bool1)); //false
		//OR 연산
		System.out.println((bool1 || bool2)); //true
		System.out.println((bool1 || 10==20)); //true
		System.out.println((bool2 || bool1)); //true
		System.out.println((false || bool1)); //true
		
		//NOT 연산
		System.out.println((!bool1)); //false
		System.out.println((bool1 && !bool2)); //true
		System.out.println((bool1 || !(10==20))); //true
		System.out.println((!bool2 && bool1)); //true
		System.out.println((!false || bool1)); //true
		

	}

}
