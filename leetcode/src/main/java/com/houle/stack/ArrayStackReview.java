package com.houle.stack;

public class ArrayStackReview {

    // 数组、元素统计、栈深度
    private final String[] items;
    private int count;
    private final int n;

    // 栈的初始化
    public ArrayStackReview(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    // 入栈
    public boolean push(String item) {
        // 重点考虑栈满的情况
        if (count == n) {
            return false;
        }
        items[count] = item;
        ++count;
        return true;
    }

    // 出栈
    public String pop() {
        // 重点考虑空栈的情况
        if (count == 0) {
            return null;
        }
        String tmp = items[count-1];
        --count;
        return tmp;
    }

    public static void main(String[] args) {
        ArrayStackReview arrayStackReview = new ArrayStackReview(6);
        arrayStackReview.push("a");
        arrayStackReview.push("b");
        arrayStackReview.push("c");
        arrayStackReview.push("d");
        arrayStackReview.push("e");
        arrayStackReview.push("f");

        for (int i = 0; i < 6; i++) {
            System.out.println(arrayStackReview.pop());
        }
    }

}
