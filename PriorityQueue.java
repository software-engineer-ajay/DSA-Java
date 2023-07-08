import java.util.ArrayList;

public class PriorityQueue {

    /**
     * In a queue, the first-in-first-out rule is implemented whereas, in a priority
     * queue, the values are removed on the basis of priority. The element with the
     * highest priority is removed first.
     * 
     * Priority queue can be implemented using an array, a linked list, a heap data
     * structure, or a binary search tree. Among these data structures, heap data
     * structure provides an efficient implementation of priority queues.
     * 
     * Hence, we will be using the heap data structure to implement the priority
     * queue in this tutorial. A max-heap is implemented in the following
     * operations. If you want to learn more about it, please visit max-heap and
     * min-heap.
     * 
     * A comparative analysis of different implementations of priority queue is
     * given below.
     * 
     * Operations peek insert delete
     * Linked List O(1) O(n) O(1)
     * Binary Heap O(1) O(log n) O(log n)
     * Binary Search Tree O(1) O(log n) O(log n)
     * 
     * Heapify
     * Heapify is the process of creating a heap data structure from a binary tree.
     * It is used to create a Min-Heap or a Max-Heap.
     * 
     * 1. Let the input array be
     * ----3 9 2 1 4 5
     * 2. Create a "complete binary tree" from the array
     * 3. Start at first index of non-leaf node whose index is given by n/2 -1
     * 4. Set current element i as largest.
     * 5. The index of left child is given by 2i + 1 and the right child is given by
     * -----2i + 2.
     * -----If leftChild is greater than currentElement (i.e. element at ith index),
     * -----set leftChildIndex as largest.
     * -----If rightChild is greater than element in largest, set rightChildIndex as
     * -----largest.
     * 6. Swap largest with currentElement
     * 7. Repeat steps 3-7 until the subtrees are also heapified.
     * 
     * @param args
     */

    void heapify(ArrayList<Integer> hT, int i) {
        // Function to heapify the tree
        int size = hT.size();
        // Find the largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && hT.get(l) > hT.get(largest))
            largest = l;
        if (r < size && hT.get(r) > hT.get(largest))
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) { // Base Condition
            int temp = hT.get(largest);
            hT.set(largest, hT.get(i));
            hT.set(i, temp);

            heapify(hT, largest);
        }
    }

    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) { // Check arraylist is empty then no need to heapify.
            hT.add(newNum);
        } else {
            hT.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }
        // Swap
        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);

        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        PriorityQueue h = new PriorityQueue();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}
