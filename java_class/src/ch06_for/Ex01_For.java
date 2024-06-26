package ch06_for;

public class Ex01_For {
    public static void main(String[] args) {
        for (int i =1; i<=3; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 2; i<= 10; i += 2 ) {
            System.out.println("i = " + i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
        }

        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}
