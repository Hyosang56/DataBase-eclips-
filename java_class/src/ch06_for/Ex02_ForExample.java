package ch06_for;

public class Ex02_ForExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++ ) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합: " + sum);
    }
}
