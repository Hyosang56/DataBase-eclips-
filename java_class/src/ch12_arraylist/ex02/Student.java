package ch12_arraylist.ex02;

public class Student {
    private int id;
    private String studentMajor;
    private String studentName;
    private String studentNumber;
    private String studentMobile;

    public Student() {
    }

    public Student(int id, String studentMajor, String studentName, String studentNumber, String studentMobile) {
        this.id = id;
        this.studentMajor = studentMajor;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMobile = studentMobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
