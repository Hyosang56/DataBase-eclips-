package ch10_class.ex09;

public class Student {
    /**
     * 학생의 정보
     * 학과(studentMajor)
     * 이름(studentName)
     * 학번(studentNumber)
     * 전화번호(studentMobile)
     *
     * 필드, getter/setter, 기본생성자,
     * 모든필드 매개변수로 하는 생성자
     * toString 메서드 정의
     */
    private String studentMajor;
    private String studentName;
    private String studentNumber;
    private String studentMobile;

    public Student() {
    }

    public Student(String studentMajor, String studentName, String studentNumber, String studentMobile) {
        this.studentMajor = studentMajor;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMobile = studentMobile;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentMajor='" + studentMajor + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}

