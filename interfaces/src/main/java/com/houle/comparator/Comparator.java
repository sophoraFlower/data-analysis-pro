package com.houle.comparator;

//public interface Comparator<T> {
//    int compare(T first, T second);
//}

import java.util.Comparator;

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}