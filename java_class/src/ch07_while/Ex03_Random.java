package ch07_while;

import jdk.swing.interop.SwingInterOpUtils;

public class Ex03_Random {
    public static void main(String[] args) {
        /**
         * Random 메서드: 지정한 범위 내에서 숫자를 무작위로 발생시킴
         * Math 클래스의 random 메서드 사용
         * 1~10 사이의 정수
         * (int) (Math.random() * 10) + 1
         */
        // random() 호출: 0.0 이상 1.0 미만의 실수
        System.out.println(Math.random());

        // 결과값에 10을 곱해서 정수 부분을 만듬
        System.out.println(Math.random()*10);
        // 실수(double) => 정수(int)로의 변환: 형변환(type conversion) (0 이상 10 미만 정수)
        System.out.println((int)(Math.random()*10));
        // 1 이상 10이하의 정수
        System.out.println((int)(Math.random()*10)+1);
        // 1 이상 45 이하 정수
        System.out.println((int)(Math.random()*45)+1);


        // 형변환
        int int1 =10;
        double double1 = 1.23456;

        //정수형 변수를 실수형 변수에 대입(정수형 값(10) 실수형 깂10.0)으로 자동형변환
        double double2 =int1;
        System.out.println("double2 = " + double2);

        //실수형 변수를 정수형 변수에 대입(강제형변환(casting))
        int int2= (int) double1;
        System.out.println("int2 = " +int2);

    }
}
