package ch09_array;

public class Ex02_Array {
    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int sum = 0;
        //배열에 담신 데이터 출력
        System.out.println("numbers1[0] = " + numbers1[0]);
        System.out.println("numbers1[0] = " + numbers1[1]);
        System.out.println("numbers1[0] = " + numbers1[2]);
        System.out.println("numbers1[0] = " + numbers1[3]);
        System.out.println("numbers1[0] = " + numbers1[4]);

        //for문을 이용하여 배열에 담긴 데이터 출력
        for (int i=0; i < numbers1.length; i++ ) {
            System.out.println(" numbers1[] = " + numbers1[i]);
        }

        // numbers1에 저장된 모든 값의 총합, 평균 출력
        for (int i=0; i < numbers1.length; i++ ) {
            sum += numbers1[i];
        }
        double avg = (double) sum/numbers1.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg );
    }
}
