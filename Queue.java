/**
 * Basic operation of queue
 * --Enqueue -> Add an element to the end of the queue
 * --Dequeue -> Remove an element from the front of the queue
 * --isEmpty -> Check if the queue is empty
 * --isFull -> Check if the queue is full
 * --Peek -> Get the value of the front of the queue without removing it
 */

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front;
    int rear;

    Queue() {
        // default constructor
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    int size() {
        return (rear - front) + 1;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Delete --> " + element);
            return (element);
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue.");
            return -1;
        } else {
            System.out.println("Peek Item -> " + items[0]);
            return items[0];
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue.");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.print("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.print("\nRear index -> " + rear);
            System.out.println("\nAvailable Element count -> " + size() + '\n');

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.peek();

        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 3 elements
        q.display();

    }
}
