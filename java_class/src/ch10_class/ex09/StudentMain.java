package ch10_class.ex09;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student 객체 만들고 setter 이용하여 필드값 저장
        // 객체에 저장된 필드값 출력
        Student student1 = new Student();
        student1.setStudentMajor("정보통신과");
        student1.setStudentName("학생1");
        student1.setStudentNumber("20241111");
        student1.setStudentMobile("010-1111-1111");
        System.out.println("student1 = " + student1);

        // 모든 필드를 매개변수로 하는 생성자로 Student 객체 만들고
        // 객체에 저장된 필드값 출력
        Student student2 = new Student("정보통신과", "학생2", "20242222", "010-2222-2222");
        System.out.println("student2 = " + student2);
    }
}

