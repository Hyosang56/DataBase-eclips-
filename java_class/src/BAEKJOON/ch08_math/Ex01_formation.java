package BAEKJOON.ch08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01_formation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int sum = 0;
        int exponent = n.length()-1;
        int b = Integer.parseInt(st.nextToken());
        for (int i = 0; i <n.length() ; i++) {
            int a = con(n.charAt(i));
            sum += (int)(a*(Math.pow(b,exponent)));
            exponent --;
        }
        System.out.println(sum);
    }
    public static int con(char word){
        if(word >= 'A' && word <='Z'){
            return 10 + (word -'A');
        } else {
            return Character.getNumericValue(word);
        }
    }
}





