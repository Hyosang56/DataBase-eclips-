package Ch04_if;

public class Ex04_NestedIf {
    public static void main(String[] args) {
        //중첩 if 문
        boolean cond = true;
        int num = 10;
        if (cond) {
            if (num >= 10) {
                System.out.println("cond가 true이고 num이 10이상");
            } else if (num < 10) {
                System.out.println("cpmd가 true이고 num이 10미만");
            } else if (num == 10) {
                System.out.println("cpmd가 true이고 num이 10");
            } else {
                System.out.println("cpmd가 true이고 num은 판단 불가");
            }
        } else {
           System.out.println("바깥 if 조건 만족하지 않음");
        }
    }
}
