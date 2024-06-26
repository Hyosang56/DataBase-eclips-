package BAEKJOON.ch06_deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07_group {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i <n ; i++) {
            String str = br.readLine();
            boolean result = true;
            for (int j = 0; j <str.length() ; j++) {
                for (int k = j+1; k <str.length() ; k++) {
                    System.out.println(j);
                    if(str.charAt(j) == str.charAt(k)){
                        if((j+1)==k){
                            j++;
                            System.out.println(j);
                        }else {
                            result=false;
                        }
                    }
                }

            }
            if(result){
                count++;
            }
        }
        System.out.println(count);
    }
}
