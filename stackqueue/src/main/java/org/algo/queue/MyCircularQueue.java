package org.algo.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/
 */
public class MyCircularQueue {

    private List<Integer> queue;
    private int size;
    int head;
    int tail;
    int currentSize;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new ArrayList<Integer>(k);
        size = k;
        head = -1;
        tail = -1;
        currentSize = 0;
    }


    /**
     * Get size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (currentSize >= size) {
            return false;
        }
        if (currentSize == 0) {
            head = getNext(head, size);
        }
        tail = getNext(tail, size);
        queue.add(tail, value);
        currentSize++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (currentSize <= 0) {
            return false;
        }
        queue.remove(head);
        head = getNext(head, size);
        currentSize--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return queue.get(head);
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return queue.get(tail);
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return currentSize < 1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return currentSize == size;
    }

    /**
     * Start from zero if reached at end.
     */
    private int getNext(int current, int size) {
        if (current < size - 1) {
            current++;
        } else {
            current = 0;
        }
        return current;
    }

/*    public static void main(String args[]) {

        // Your MyCircularQueue object will be instantiated and called as such:
        MyCircularQueue obj = new MyCircularQueue(5);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    }*/
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */