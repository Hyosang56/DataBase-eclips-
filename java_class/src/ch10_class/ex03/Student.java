package ch10_class.ex03;

public class Student {
    String studentMajor;
    String studentName;
    String studentNumber;
    String studentMobile;

    //기본생성자 선언
    public Student() {
        System.out.println("기본 생성자");
    }

    //매개변수가 있는 생성자
    public Student(String studentMajor) {
        System.out.println("major 매개변수 생성자");
        System.out.println("studentMajor = " + studentMajor);
    }

    //매개변수 2개 있는 생성자
    public Student(String studentMajor, String studentName) {
        System.out.println("studentMajor = " + studentMajor + ", studentName = " + studentName);
    }
    //매개변수 3개 있는 생성자(학과, 이름, 학번)
    public Student(String studentMajor, String studentName,String studentNumber) {
        System.out.println("studentMajor = " + studentMajor + ", studentName = " + studentName + ", studentnumber = " + studentNumber);
    }

    //매개변수 4개 있는 생성자(학과, 이름, 학번, 전화번호)
    public Student(String studentMajor, String studentName,String studentNumber, String studentMobile){
        System.out.println("studentMajor = " + studentMajor + ", studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMobile = " + studentMobile);
    }
}
