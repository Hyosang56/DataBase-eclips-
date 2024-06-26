package ch14_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        Map<Integer, String > map1 = new HashMap<>();
        map1.put(1,"안녕하세요");
        map1.put(2,"반갑습니다");
//        map1.put(3, 10000); // value 불일치
//        map1.put("4","hello"); //key 타입 불일치
        System.out.println(map1.get(1));
        String str1 = map1.get(2);
        System.out.println("str1 = " + str1);
        map1.put(1,"hihi");
        System.out.println(map1.get(1));
        for(int i:map1.keySet()){
            System.out.println(map1.get(i));
        }
        Map<String ,String> map2 = new HashMap<>();
        map2.put("가","hello");
        map2.put("나","오늘은 목요일");
        map2.put("A","안녕");
        System.out.println(map2.get("나"));
        System.out.println(map2.get("A"));
        for(String k: map2.keySet()){
            System.out.println(map2.get(k));
        }
        Map<Long, String > map3 = new HashMap<>();
        String s1 = map3.put(1L,"안녕");
        System.out.println("s1 = " + s1);
        String s2 = map3.put(2L, "hello");
        System.out.println("s2 = " + s2);
        String s3 = map3.put(1L, "반가워요");
        System.out.println("s3 = " + s3);
        System.out.println(s3);
    }
}
