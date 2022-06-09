package com.houle.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {

        var stuff = new Employee[3];
        stuff[0] = new Employee("Tom", 18000);
        stuff[1] = new Employee("Danny", 15000);
        stuff[2] = new Employee("Joy", 22000);

        Arrays.sort(stuff);

        for (Employee e: stuff
             ) {
            System.out.println(e.getName());
        }
    }

}
