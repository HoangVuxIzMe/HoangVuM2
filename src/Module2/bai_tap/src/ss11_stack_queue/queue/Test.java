package ss11_stack_queue.queue;

public class Test {
    public static void main(String[] args) {
        Queue testQueue = new Queue();
        testQueue.enQueue(5);
        testQueue.enQueue(4);
        testQueue.deQueue();
        testQueue.enQueue(6);
        testQueue.deQueue();

        testQueue.display();
    }
}
