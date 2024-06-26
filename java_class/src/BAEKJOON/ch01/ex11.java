package BAEKJOON.ch01;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        System.out.println(num1+num2+num3);
    }
}
/** 문제에서 입력값을  (1 ≤ A, B, C ≤ 10^12) 으로 주어졌다.
 *  int : 32bit(4byte), -2^31 ~ 2^31-1 == 10^9
 *  따라서 int를 쓸 수 없다.
 *  long : 64bit(8byte)
 *  훨씬 큰 long 사용
 */

