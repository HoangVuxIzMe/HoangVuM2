package ss11_stack_queue.occurened_of_the_word;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your type: ");
        String word = sc.nextLine();
        String[] arrWord = word.split(" ");
        for (int i = 0; i < arrWord.length; i++) {
            arrWord[i] = arrWord[i].toLowerCase();
            if (wordMap.containsKey(arrWord[i])) {
                wordMap.replace(arrWord[i], wordMap.get(arrWord[i]) + 1);
            } else {
                arrWord[i].toLowerCase();
                wordMap.put(arrWord[i], 1);
            }
        }
        System.out.println(wordMap);
    }
}
