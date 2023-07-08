public class CircularQueue {
    /*
     * A circular queue is the extended version of a regular queue where the last
     * element is connected to the first element. Thus forming a circle-like
     * structure.
     * The circular queue solves the major limitation of the normal queue. In a
     * normal queue, after a bit of insertion and deletion, there will be non-usable
     * empty space.
     * 
     * if REAR + 1 == 5 (overflow!), REAR = (REAR + 1)%5 = 0 (start of queue)
     * 
     * Basic operation of circular queue
     * --Enqueue -> Add an element to the end of the queue
     * --Dequeue -> Remove an element from the front of the queue
     * --isEmpty -> Check if the queue is empty
     * --isFull -> Check if the queue is full
     * --Peek -> Get the value of the front of the queue without removing it
     */

    int SIZE = 5;
    int items[] = new int[SIZE];
    int front;
    int rear;

    CircularQueue() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = item;
            System.out.println("Inserted: " + item);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            element = items[front];
            if (front == rear) { /* Q has only one element, so we reset the queue after deleting it. */
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }
        }
        return element;
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        // Fails because front = -1
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        q.display();

        int elem = q.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        q.display();

        q.enQueue(7);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
    }
}
