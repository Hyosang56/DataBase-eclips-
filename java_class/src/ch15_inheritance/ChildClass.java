package ch15_inheritance;

public class ChildClass extends ParentClass{
    public ChildClass() {
        System.out.println("자식클래스 기본생성자");
    }

    //부모클래스의 hello 메서드 재정의
    //내용을 바꾸는건 괜찮지만 메서드 이름,리턴,매개변수 수정붙가
    @Override
    public void hello() {
        System.out.println("ChileClass.hello");
    }

}
