package ss10_dsa_array_list.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        //Mảng cố định có phần tử là 14
        MyLinkedList linkedList = new MyLinkedList<>(14);

        //Thêm phần tử vào đầu cuối của mảng
        linkedList.addFirst(4);
        linkedList.addLast(6);
        linkedList.addFirst(7);

        //Thêm p.tử 9 vào vị trí thứ 4
        linkedList.add(4,9);
        //Thêm p.tử vào mảng
        linkedList.add(2);

        System.out.print("Array linked list: ");
        linkedList.printList();
    }
}
