package com.houle.queue;

public class Temp {

    private final String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public Temp(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    public boolean enqueue(String item) {
        if (tail == n) {
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    public String dequeue() {
        if(head == tail){
            return null;
        }
        String ret = items[head];
        ++head;
        return ret;
    }

}
