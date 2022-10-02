package ss10_dsa_array_list.array_list;

import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyList<Integer> listTest = new MyList<>();
        listTest.addIndex(4);
        listTest.addIndex(3);
        listTest.addIndex(6);
        listTest.addIndex(2);
        listTest.addIndex(9);

        System.out.print("Array List: ");
        listTest.display();

        System.out.print("\nEnter your delete index: ");
        int deleteIndex1 = sc.nextInt();
        listTest.removeIndex(deleteIndex1);
        listTest.contain(6);
        System.out.print("Array List: ");
        listTest.display();
    }
}
