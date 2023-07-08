public class Deque {
    /**
     * Deque or Double Ended Queue is a type of queue in which insertion and removal
     * of elements can either be performed from the front or the rear. Thus, it does
     * not follow FIFO rule (First In First Out).
     * 
     * Types of Deque
     * 1.Input Restricted Deque: Input is restricted at a single end but allows
     * -----deletion at both the ends.
     * 2.Output Restricted Deque: Output is restricted at a single end but allows
     * -----insertion at both the ends.
     * 
     * @param args
     */
    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size;

    public Deque(int size) {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insert_front(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        arr[front] = key;
    }

    void insert_rear(int key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        arr[rear] = key;
    }

    void delete_front() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void delete_rear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {

        Deque dq = new Deque(4);

        System.out.println("Insert element at rear end : 5 ");
        dq.insert_rear(5);

        System.out.println("insert element at rear end : 6 ");
        dq.insert_rear(6);

        System.out.println("get rear element : " + dq.getRear());

        dq.delete_rear();
        System.out.println("After delete rear element new rear become : " + dq.getRear());

        System.out.println("inserting element at front end");
        dq.insert_front(10);

        System.out.println("get front element: " + dq.getFront());

        dq.delete_front();

        System.out.println("After delete front element new front become : " + +dq.getFront());

    }
}
