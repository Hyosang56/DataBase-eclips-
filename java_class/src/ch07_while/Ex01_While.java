package ch07_while;

public class Ex01_While {
    public static void main(String[] args) {

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l= " + l);
            l++;
            if (l ==3) {
                run = false;
            }
            System.out.println("run=false 다음 문장");
        }
    }
}
