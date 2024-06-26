package ch03_scanner;

// jaca.util 패키지에 있는 Scanner 클래스 활용
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// Scanner 클래스 객체 선언
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);

		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println("입력한 이름: "+name);
		
		scanner.nextLine();
		
		System.out.print("주소를 입력하세요: ");
		String address = scanner.nextLine();
		System.out.println("입력한 이름: "+address);


	}

}
