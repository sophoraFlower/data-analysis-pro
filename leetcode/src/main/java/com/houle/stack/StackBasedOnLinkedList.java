package com.houle.stack;

public class StackBasedOnLinkedList {

    // 定义top节点
    private Node top = null;
    // 入栈操作
    public void push(String value) {
        Node newNode = new Node(value, null);
        // 栈空的情况
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
    // 出栈操作
    public String pop() {
        // 栈空的情况
        if (top == null) {
            return null;
        } else {
            String temp = top.getData();
            top = top.next;
            return temp;
        }
    }

    // 节点类
    public static class Node{
        public String data;
        public Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        StackBasedOnLinkedList basedOnLinkedList = new StackBasedOnLinkedList();
        basedOnLinkedList.push("a");
        basedOnLinkedList.push("b");
        basedOnLinkedList.push("c");
        basedOnLinkedList.push("d");
        basedOnLinkedList.push("e");
        basedOnLinkedList.push("f");
        for (int i = 0; i < 6; i++) {
            System.out.println(basedOnLinkedList.pop());
        }
    }
}
