package ch08_string;

public class Ex01_Sting {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "안녕";
        String str3 = new String("안녕");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3) );
    }
}
