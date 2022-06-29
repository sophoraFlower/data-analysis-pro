package com.houle.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var stuff = new Employee[3];
        stuff[0] = new Employee("Hole", 22000);
        stuff[1] = new Employee("Tom", 16000);
        stuff[2] = new Employee("Miky", 20000);

        Arrays.sort(stuff);
        for (Employee e : stuff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
