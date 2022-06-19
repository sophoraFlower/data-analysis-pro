package com.houle.queue;

public class ArrayQueuePlus {
    // 数组：items，数组大小：n
    private final String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public ArrayQueuePlus(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队
    public boolean enqueue(String item) {
        // tail ==n && head==0，表示整个队列都占满了
        if (tail == n) {
            if (head == 0) return false;
            // ♥️ 数据搬移操作 ♥️
            for (int i = head; i < tail; ++i) {
                items[i-head] = items[i];
            }
            // 搬移完之后重新更新head和tail tail -= head; head = 0;
            tail = tail - head;
            head = 0;
        };
        items[tail] = item;
        ++tail;
        return true;
    }

    // 出队
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) return null;
        // 为了让其他语言的同学看的更加明确，把--操作放到单独一行来写了
        String ret = items[head];
        ++head;
        return ret;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for(int i=0; i<6; i++){
            boolean en = arrayQueue.enqueue(String.valueOf(i));
            System.out.println(en);
        }
        for(int i=0; i<6; i++){
            String de = arrayQueue.dequeue();
            System.out.println(de);
        }
    }
}
