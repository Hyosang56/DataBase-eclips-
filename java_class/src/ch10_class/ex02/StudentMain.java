package ch10_class.ex02;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("객체 생성 전");
        Student student1 = new Student();
        System.out.println("객체 생성 후");
        // t\생성한 객체로 필드 활용
        student1.studentMajor = "정보통신학과";
        student1.studentName = "학생1";
        student1.studentNumver = "20241111";
        student1.studentMobile = "010-1111-1111";
        System.out.println("student1.studentMajor = " + student1.studentMajor);
        System.out.println("student1.studentName = " + student1.studentName);
        System.out.println("student1.studentNumber = " + student1.studentNumver);
        System.out.println("student1.studentMobile = " + student1.studentMobile);

        //새로운 객체
        Student student2 = new Student();
        student2.studentMajor = "컴퓨터공학과";
        student2.studentName = "학생2";
        student2.studentNumver = "20231111";
        student2.studentMobile = "010-2222-2222";
    }
}
