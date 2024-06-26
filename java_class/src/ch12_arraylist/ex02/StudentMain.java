package ch12_arraylist.ex02;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 담기 위한 studentList
        List<Student> studentList = new ArrayList<>();
//        studentList.add(10);
//        studentList.add("학생1");
        Student student1 = new Student(1, "정보통신과","학생", "20201111","010-1111-1111");
        //student1 객체를 studentList에 추가
        studentList.add(student1);
        Student student2 = new Student();
        student2.setId(2);
        student2.setStudentMajor("정보통신과");
        student2.setStudentName("학생2");
        student2.setStudentNumber("20242222");
        student2.setStudentMobile("010-2222-2222");
        studentList.add(student2);
        System.out.println("studentList.get(0) = " + studentList.get(0));
        //0번 인덱스에 담긴 학생의 이름만 출력
        System.out.println(studentList.get(0).getStudentName());
        Student st = studentList.get(1);
        System.out.println("st = " + st);
        System.out.println("st.getStudentMobile() = " + st.getStudentMobile());
        //반복문을 이용하여 학생 전체정보와 학새의 이름만 출력
        // for문, for each, 화살표 함수
        for (int i = 0; i <studentList.size() ; i++) {
            System.out.println("studentList.get(i) = " + studentList.get(i));
            System.out.println("studentList.get(i).getStudentName() = " + studentList.get(i).getStudentName());
            
        }
        for(Student student:studentList ) {
            System.out.println("student = " + student);
            System.out.println("student.getStudentName() = " + student.getStudentName());
        }
        studentList.forEach(student ->{
            System.out.println("student = " + student);
            System.out.println("student.getStudentName() = " + student.getStudentName());
        });
    }
}
