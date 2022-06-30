package com.houle.comparator;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary", "Tom", "Aimmy Dart"};
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));  // [Aimmy Dart, Mary, Paul, Peter, Tom]
        var copm = new LengthComparator();
        Arrays.sort(friends, copm);
        System.out.println(Arrays.toString(friends));  // [Tom, Mary, Paul, Peter, Aimmy Dart]
    }
}
