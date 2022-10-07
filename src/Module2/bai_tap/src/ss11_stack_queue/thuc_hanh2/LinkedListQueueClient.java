package ss11_stack_queue.thuc_hanh2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        System.out.println("Dequeued: " + queue.dequeue().key);
    }
}
