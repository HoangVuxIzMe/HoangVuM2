package ss11_stack_queue.reverse_array_prime_number;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringNonMethodTest {
    public static void main(String[] args) {
        Stack mStack = new Stack<>();
        Stack wStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your type: ");
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            mStack.push(s1.charAt(i));
        }
        while(!mStack.isEmpty()){
            wStack.push(mStack.pop());
        }
        System.out.println(wStack);
    }
}
