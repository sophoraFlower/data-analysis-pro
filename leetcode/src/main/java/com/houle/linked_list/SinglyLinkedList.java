package com.houle.linked_list;

/**
 * 无头非循环单链表
 */
public class SinglyLinkedList {

    // head 是引用
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    // 头部插入
    public void addHead(String data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    // 尾部插入
    public void addLast(String data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = node;
        } else {
            // 创建cur节点
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    private Node searchIndex(int index) {
        Node cur = head;
        while (index-1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public int size() {
        Node cur = head;
        int count = 0;
        if (cur == null) {
            return 0;
        } else {
            while (cur.next != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }
    }

    // 任意位置插入
    public boolean addIndex(int index, String data) {
        if (index < 0 || index > size()) {
            return false;
        }
        if (index == 0) {
            addHead(data);
            return true;
        } else {
            Node cur = searchIndex(index);
            Node node = new Node(data, null);
            node.next = cur.next;
            cur.next = node;
            return true;
        }
    }

    // 定义节点类
    private static class Node {
        public String data;
        public Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addHead("c");
        singlyLinkedList.addHead("b");
        singlyLinkedList.addHead("a");
        singlyLinkedList.addLast("f");
        singlyLinkedList.addIndex(3,"d");
        singlyLinkedList.addIndex(4, "e");
        while (singlyLinkedList.head.next != null) {
            System.out.println(singlyLinkedList.head.data);
            singlyLinkedList.head = singlyLinkedList.head.next;
        }
        System.out.println(singlyLinkedList.head.data);
    }
}
