package ch16_interface.ex01;

public class IntMain {
    public static void main(String[] args) {
        //Interface1 interface1 = new Interface1()
        Impl1 impl1 = new Impl1();
        impl1.method1();
        Impl2 impl2 = new Impl2();
        impl2.method1();

        Interface1 interface1 = new Impl1();
        interface1.method1();
        interface1 = new Impl2();
        interface1.method1();
    }
}
