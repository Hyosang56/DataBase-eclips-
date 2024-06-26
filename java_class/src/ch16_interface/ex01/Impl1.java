package ch16_interface.ex01;

//Interface1 의 구현클래스
public class Impl1 implements Interface1{
    @Override   //메서드 재정의
    public void method1() {
        System.out.println("Impl1.method1");
    }
}
