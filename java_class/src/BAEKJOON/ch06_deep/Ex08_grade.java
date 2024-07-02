package BAEKJOON.ch06_deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex08_grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        float credit = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            float grades = Float.parseFloat(st.nextToken());
            String score = st.nextToken();
            if(!score.equals("P")){
                float trans = transform(score);
                sum += grades;
                credit += (trans*grades);
            }
        }
        System.out.println(credit/sum);
    }
    public static float transform(String score){
        float re = 0;
        if(score.equals("A+")){
            re = 4.5f;
        } else if (score.equals("A0")) {
            re = 4.0f;
        } else if (score.equals("B+")) {
            re = 3.5f;
        } else if (score.equals("B0")) {
            re = 3.0f;
        } else if (score.equals("C+")) {
            re = 2.5f;
        } else if (score.equals("C0")) {
            re = 2.0f;
        } else if (score.equals("D+")) {
            re = 1.5f;
        } else if (score.equals("D0")) {
            re = 1.0f;
        } else if (score.equals("F")) {
            re = 0.0f;
        }
        return re;
    }
}
