package ch11_access_modifier.b;

import ch11_access_modifier.a.A1;

public class B1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        //A1 클래스가 가진 필드 접근
//        System.out.println(a1.field1);
//        System.out.println(a1.field2);
//        System.out.println(a1.field3);
        System.out.println(a1.field4);

        //A2 클래스 객체
//        A2 a2 = new A2();

    }
}

