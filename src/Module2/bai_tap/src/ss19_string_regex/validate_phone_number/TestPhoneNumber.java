package ss19_string_regex.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        String regexPhoneNumber = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regexPhoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.println("Complete!");
        }else {
            System.out.println("Wrong!");
        }
    }
}
