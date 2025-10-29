package Mod3_Assignment.set3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5 {
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email1 = "example@test.com";
        String email2 = "invalid-email@";

        System.out.println(email1 + " is valid? " + isValidEmail(email1));
        System.out.println(email2 + " is valid? " + isValidEmail(email2));
    }
}