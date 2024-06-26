package ch13_classes.ex01;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
    public void method1() {
        System.out.println("StudentService.method1");
    }
    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "안녕하세요";
        //StudentRepository의 method2 호출
        studentRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 만들고 필드값을 담은 뒤에 StudentRepository의 method3으로
     * StudentDTO 객체를 전달
     */
    public void method3() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1);
        studentDTO.setStudentMajor("정보통신");
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("2024-1111");
        studentDTO.setStudentMobile("010-1111-1111");
        studentRepository.method3(studentDTO);
    }

    /**
     * Repository로 부터 studentList 객체를 받아와서
     * for문으로 출력
     */
    public void method4() {
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO: studentDTOList) {
            System.out.println("studentDTO = " + studentDTO);
        }
    }
    /**
     * 조회할 id를 입력받고
     * id를 Repository의 method로 전달하고
     * id에 해당하는 DTO객체를 전달받아서 출력
     */
    public void method5( ) {
        System.out.print("조회할 id를 입력: ");
        long id = scanner.nextLong();;
        StudentDTO studentDTO = studentRepository.method5(id);
        if(studentDTO != null){
            System.out.println("studentDTO = " + studentDTO);
        } else {
            System.out.println("찾으시는 정보가 없습니다.");
        }
    }
}
