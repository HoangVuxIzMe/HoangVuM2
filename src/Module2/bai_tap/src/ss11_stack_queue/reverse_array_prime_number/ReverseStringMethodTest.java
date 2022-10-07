package ss11_stack_queue.reverse_array_prime_number;

public class ReverseStringMethodTest {
    public static void stackOfNumber() {
        ReverseString<Integer> nStack = new ReverseString<>();
        int[] mNumber = {2, 4, 5, 7};
        for (int n : mNumber) {
            nStack.push(n);
        }
        while (!nStack.isEmpty()) {
            System.out.printf(" %d", nStack.pop());
        }
    }
    public static void stackOfString(){
        ReverseString<String> wStack = new ReverseString<>();
        String s1 = "Tôi là coder";
        for (int i = 0; i < s1.length(); i++) {
            wStack.push(s1.charAt(i) + "");
        }
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
    public static void main(String[] args) {
        System.out.print("Array number: ");
        stackOfNumber();
        System.out.println();
        System.out.print("Array string: ");
        stackOfString();
    }
}
