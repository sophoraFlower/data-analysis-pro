package com.houle.equals;

public class EqualsTest2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("张三",8000, 1992, 2, 28);
        Employee e2 = new Employee("张三",8000, 1992, 2, 28);
        Employee e3 = new Employee("李四",8000, 1992, 2, 28);
        Employee e4 = null;
        Manager e5 = new Manager("张三",8000, 1992, 2, 28);

        System.out.println(e1.equals(e1));  // true
        System.out.println(e1.equals(e2));  // true
        System.out.println(e1.equals(e3));  // false
        System.out.println(e1.equals(e4));  // false
        System.out.println(e1.equals(e5));  // false
    }
}
