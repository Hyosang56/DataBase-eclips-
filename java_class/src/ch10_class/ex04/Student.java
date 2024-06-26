package ch10_class.ex04;

public class Student {
    // 학과(studentMajor), 이름(studentName),
    // 학번(studentNumber), 전화번호(studentMobile) 필드
    String studentMajor;
    String studentName;
    String studentNumber;
    String studentMobile;

    //기본생성자
    public Student() {
    }

    //학과, 이름, 학번, 전화번호를 매개변수로 하는 생성자
    public Student(String studentMajor, String studentName, String studentNumber, String studentMobile) {
        //매개변수로 전달받은 값을 필드에 저장
        //좌변(필드이름) = 우변(매개변수이름)
        this.studentMajor = studentMajor; //this. 필드를 지칭
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMobile = studentMobile;

    }

}
