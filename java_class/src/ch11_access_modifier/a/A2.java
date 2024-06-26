package ch11_access_modifier.a;
//defalut 접근제한자를 갖는 클래스
class A2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        //A1 클래스가 가진 필드 접근
//        System.out.println(a1.field1);
        System.out.println(a1.field2);
        System.out.println(a1.field3);
        System.out.println(a1.field4);

        System.out.println(A1.field2);
    }
}
