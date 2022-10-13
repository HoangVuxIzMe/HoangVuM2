package ss13_search_operator;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inpStr = sc.nextLine();

        LinkedList<Character> maxStr = new LinkedList<>();
        for (int i = 0; i < inpStr.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(inpStr.charAt(i));

            for (int j = 0; j < inpStr.length(); j++) {
                if (inpStr.charAt(j) > list.getLast()){
                    list.add(inpStr.charAt(j));
                }
            }
            if (list.size() > maxStr.size()){
                maxStr.clear();
                maxStr.addAll(list);
            }
            list.clear();
        }

        for (Character ch : maxStr){
            System.out.print(ch);
        }
        System.out.println();
    }
}
