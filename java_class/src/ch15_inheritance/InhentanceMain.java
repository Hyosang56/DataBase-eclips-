package ch15_inheritance;

public class InhentanceMain {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.setName("이름1");
        parentClass.setAge(10);
        System.out.println("parentClass = " + parentClass);
        parentClass.hello();

        ChildClass childClass = new ChildClass();
        // 상속을 받았기 때문에 getter/setter 사용 가능
        childClass.setName("이름2");
        childClass.setAge(20);
        System.out.println("childClass = " + childClass);
        childClass.hello();

        ParentClass parentClass1 = new ChildClass();
        parentClass1.hello();
        parentClass1 = new ParentClass();
        parentClass1.hello();

//        ChildClass childClass1 = new ParentClass();
        // 부모클래스가 더 커서 자식클래스에 대입할수없다.
    }
}
