package com.houle.arrays;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        ArrayList<Employee> staff_02 = new ArrayList<>(100);
        // JAVA 10
        var student = new ArrayList<Student>();

        staff.add(new Employee("Cat", 8000, 2000, 12, 12));
        staff.add(new Employee("Dog", 10000, 2000, 12, 12));

        student.ensureCapacity(3);
        // System.out.println(student.get(0));  // IndexOutOfBoundsException
        student.add(new Student("Tom", "Physics"));
        student.add(new Student("Jany", "Physics"));
        student.add(new Student("Danny", "Physics"));
        student.add(new Student("Lili", "Physics"));
        System.out.println(student.get(3).getName());  // Lili

        System.out.println(staff.size());  // 2
        System.out.println(staff_02.size());  // 0

        for (int i=0; i<staff.size(); i++) {
            System.out.println(staff.get(i).getDescription());
        }

        for (Employee employee : staff) {
            System.out.println(employee.getDescription());
        }

        var copied = new Employee[staff.size()];
        staff.toArray(copied);

        for (Employee employee : copied) {
            System.out.println(employee.getDescription());
        }

        staff.add(1, new Employee("Bird", 12000, 2000, 12, 12));
        System.out.println(staff.size()); // 3
        staff.remove(1);
        System.out.println(staff.size());  // 2
    }
}
