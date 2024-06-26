package ch10_class.ex03;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자를 이용한 객체 선언
        Student student1 = new Student();

        //매개변수가 있는 생성자를 이용한 객체 선언
        Student student2 = new Student("정보통신과");
        System.out.println(student2.studentMajor);

        //매개변수 2개 있는 생성자를 이용한 객체 선언
        Student student3 = new Student("컴퓨터공학과","학생2");

        String name = "학생4";
        String major = "전자공학과";
        Student student4 = new Student(major, name);

        //매개변수 3개 있는 생성자
        Student student5 = new Student("실내건축","학생3","20201111");

        //매개변수 4개 있는 생성자
        Student student6 = new Student("기계공학","학생6","20211234","010-1111-1111");

    }
}
