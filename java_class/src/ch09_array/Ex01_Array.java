package ch09_array;

public class Ex01_Array {
    public static void main(String[] args) {
        //크기가 5인 정수형 배열 number1
        int[] numbers1 = new int[5];
        System.out.println("numbers[0]} = " + numbers1[0]);
        numbers1[0] = 10;
        System.out.println("numbers1[0] = " + numbers1[0]);
        //배열의 크기 확인
        System.out.println(numbers1.length);
        
        //크기가 3인 String 배열 strings1
        String[] strings1 = new String[3];
        System.out.println("strings1[0] = " + strings1[0]);
        
        // 크기가 10인 실수형 배열 doubles1 
        double[] doubles1 = new double[10];
        System.out.println("doubles1[0] = " + doubles1[0]);

        // 정수형 배열 numbers2 이름만 선언하고 다음 줄에서 크기 B를 지정하여 배열 선언
        int[] numbers2 = null;
//        System.out.println("numbers2.length = " + numbers2.length); //NullpointerException
        numbers2 = new int[0];
        System.out.println("numbers2.length = " + numbers2.length);
        
        int[] numbers3 = {1,2,3,4};
        System.out.println("numbers3[2] = " + numbers3[2]);
        
        String[] strings2 = {"java", "python", "c", "javascript"};
        System.out.println("strings2[0] = " + strings2[0]);

    }
}
