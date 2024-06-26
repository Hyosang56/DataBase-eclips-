package ch07_while;

public class Ex02_WhileExample {
    public static void main(String[] args) {
        /**
         * 1부터 합계 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         */

        int a = 1;
        int sum = 0;
        while(true) {
            System.out.print(a+"+");
            sum += a;
            if (a >=10) {
                System.out.println(a+"="+sum);
                break;
            }
            a++;
        }
    }
}
