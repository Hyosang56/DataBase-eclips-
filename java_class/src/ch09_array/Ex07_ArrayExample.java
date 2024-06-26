package ch09_array;

public class Ex07_ArrayExample {
    public static void main(String[] args) {
        int[] numvers = {3,2,1,5,4};
        int a = 0;
        for (int i = 0; i < numvers.length ; i++) {
            for (int j = i; j < numvers.length; j++) {
                if(numvers[i]>numvers[j]) {
                    a = numvers[i];
                    numvers[i] = numvers[j];
                    numvers[j] = a;
                }
            }
        }
        System.out.print("배열값 출력: ");
        for (int i = 0; i < numvers.length ; i++) {
            System.out.print(numvers[i]+" ");

        }
    }
}
