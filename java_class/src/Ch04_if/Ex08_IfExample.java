package Ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자: ");
        int num2 = scanner.nextInt();
        System.out.print("세번째 숫자: ");
        int num3 = scanner.nextInt();
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("가장 큰 숫자는 " + num1 +" 입니다." );
            } else {
                System.out.println("가장 큰 숫자는 " + num3 +" 입니다." );
            }
        } else {
            if (num2 > num3){
                System.out.println("가장 큰 숫자는 " + num2 +" 입니다." );
            } else {
                System.out.println("가장 큰 숫자는 " + num3 +" 입니다." );
            }
        }


//        if (num1 > num2 && num1 > num3) {
//            System.out.println("가장 큰 숫자는 " + num1 +" 입니다." );
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("가장 큰 숫자는 " + num2 +" 입니다." );
//        } else if (num3 > num1 && num3 > num2) {
//            System.out.println("가장 큰 숫자는 " + num3 +" 입니다." );
//        }
//


    }
}
