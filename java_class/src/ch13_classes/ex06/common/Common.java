package ch13_classes.ex06.common;

public class Common {
    private static String loginEmail = null;

    public void loginEmail(String memberEmail){
        loginEmail = memberEmail;
    }
    public String loginCheck(){
        if(loginEmail != null) {
            return loginEmail;
        }
        return null;
    }
}
