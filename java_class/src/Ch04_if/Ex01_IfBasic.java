package Ch04_if;

public class Ex01_IfBasic {
    public static void main(String[] args) {
        //if
        boolean cond = true;
        System.out.println("if문 전");
        if (!cond) {
            System.out.println("조건 만족");
        }
        System.out.println("if문 후");

        //if else
        if (cond) {
            System.out.println("조건 만족");
        } else {
            System.out.println("조건 만족하지 않음");
        }
        int num1 = 10, num2 = 10;
        if (num1 > num2){
            System.out.println("num1이 num2보다 크다");
        } else {
            System.out.println("num2가 크다");
        }

        //if else if
        if (num1> num2) {
            System.out.println("num1 이 크다");
        } else if (num1 < num2) {
            System.out.println("num2 가 크다");
        } else {
            System.out.println("비교할 수 없다");
        }



    }
}
