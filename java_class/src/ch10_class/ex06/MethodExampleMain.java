package ch10_class.ex06;

public class MethodExampleMain {
    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();
        //method1 호출
        methodExample.method1();
        //method2 호출
        methodExample.method2(10);
        int num = 100;
        methodExample.method2(num);
        //method3 호출
        int result = methodExample.method3();
        System.out.println("result = " + result);
        System.out.println(methodExample.method3());
        //method4 호출
        String result1 = methodExample.method4("ㅎㅎㅎ");
        System.out.println("result1 = " + result1);
        //methof5 호출
        int result2 = methodExample.method5(10,20);
        System.out.println("result2 = " + result2);


    }
}
