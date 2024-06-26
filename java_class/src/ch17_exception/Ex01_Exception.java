package ch17_exception;

import java.util.ArrayList;
import java.util.List;

public class Ex01_Exception {
    public static void main(String[] args) {
        try {
            System.out.println("for문 시작 전");
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            for (int i = 0; i <= list.size(); i++) {
                System.out.println("list = " + list.get(i));
            }
            System.out.println("for문 종료 후");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 범위초과");
        }
    }
}
