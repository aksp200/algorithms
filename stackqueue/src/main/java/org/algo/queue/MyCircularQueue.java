package org.algo.queue;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/
 */
public class MyCircularQueue {

    private Integer queue[];
    private int size;
    int head;
    int tail;
    int currentSize;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new Integer[k];
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
        queue[tail] = value;
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
        queue[head] = null;
        currentSize--;
        if(head==tail){
            head=-1;
            tail=-1;
            return true;
        }
        head = getNext(head, size);
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (head == -1) {
            return head;
        }
        return queue[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (tail == -1) {
            return tail;
        }
        return queue[tail];
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
/*
    public static void main(String args[]) {

        // Your MyCircularQueue object will be instantiated and called as such:

         //["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
         //[[6],[6],[],[],[],[5],[],[],[],[],[],[]]



        MyCircularQueue obj = new MyCircularQueue(5);

        boolean param_1 = obj.enQueue(1);
        int param_2 = obj.Rear();
        int param_3 = obj.Rear();

        boolean param_4 = obj.deQueue();
        boolean param_5 = obj.enQueue(2);

        int param_6 = obj.Rear();
        boolean param_7 = obj.deQueue();

        int param_8 = obj.Front();
        boolean param_9 = obj.deQueue();
        boolean param_10 = obj.deQueue();
        boolean param_11 = obj.deQueue();

        boolean param_12 = obj.isEmpty();
        boolean param_13 = obj.isFull();


        //["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]


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