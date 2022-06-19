package com.houle.queue;

public class LinkedListQueue {

    // 基于链表实现的队列
    // 队列的队首和队尾
    private Node head = null;
    private Node tail = null;

    // head == null 和 tail == null含义相同，意外着该队列为空

    /**
     * 状态一：空队列，head = null、tail = null
     * 状态二：队列长度为1，head = tail
     * 状态二：队列长度为大于1，tail.next = null
     */
    // 入队
    public void enqueue(String value) {
        if (tail == null) {
            Node newNode = new Node(value, null);
            head = newNode;
            tail = newNode;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
    }

    // 出队
    public String dequeue() {
        // 队列为空
        if (head == null) return null;
        // 队列非空
        String value = head.data;
        head = head.next;
        // 出队后队列为空
        if (head == null) {
            tail = null;
        }
        return value;
    }

    // 节点类
    private static class Node {
        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        for (int i=0; i<10; i++){
            linkedListQueue.enqueue(String.valueOf(i));
        }
        Node p = linkedListQueue.head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
