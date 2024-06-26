package ch10_class.ex06;

public class MethodExample {
   //매개변수x, 리턴x

    public void method1() {
        System.out.println("MethodExample.method1");
    }
    //매개변수o, 리턴x
    public void method2(int num1) {
        System.out.println("num1 = " + num1);
    }
    //매개변수x, 리턴o
    public int method3() {
        System.out.println("MethodExample.method3");
        int value = 10+20;
        return value; //return 10; 도 가능
    }
    //매개변수o, 리턴o
    public String method4(String param1) {
        String str1 ="안녕하세요~";
        return str1 + param1;
    }
    public int method5(int num1, int num2) {
        int result= num1 + num2;
        return result;
    }

}
