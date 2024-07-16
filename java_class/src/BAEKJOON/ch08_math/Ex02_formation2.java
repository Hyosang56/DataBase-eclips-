package BAEKJOON.ch08_math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex02_formation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<String> strList = new ArrayList<>();
        boolean run = true;
        while(run){
            if(n >= b){
                String str = forma(n%b);
                strList.add(str);
            } else {
                String str = forma(n);
                strList.add(str);
                run = false;
            }
            n = n/b;
        }
        for (int i = strList.size()-1; i >= 0 ; i--) {
            bw.write(strList.get(i));
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static String forma(int a){
        String str ;
        if(a>=10 && a<=35){
            char ch = (char)('A'+ (a-10));
            str = String.valueOf(ch);
        } else {
            str = String.valueOf(a);
        }
        return str;
    }
}
