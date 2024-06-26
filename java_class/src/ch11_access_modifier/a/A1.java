package ch11_access_modifier.a;

public class A1 {
    private String field1 = "안녕하세요";
    static String field2 = "반갑습니다";
    protected String field3 = "금요일입니다";
    public String field4 = "내일은 주말";

    public void method1() {
        field1 = "hello";
    }
}
