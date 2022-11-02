package ss19_string_regex.validate_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClassName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your class: ");
        String className = sc.nextLine();

        String regexClassName = "^[CAP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regexClassName);
        Matcher matcher = pattern.matcher(className);

        if (matcher.matches()){
            System.out.println("Complete!");
        }else {
            System.out.println("Wrong!");
        }
    }
}
