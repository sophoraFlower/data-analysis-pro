package com.houle.arrays;

public class VariableParameter {
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: values
             ) {
            if (v > largest) {
                largest = v;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        System.out.println(max(3.1, 40,4, -20));  // 40.0
        System.out.println(max(new double[] {3.1, 40,4, -20}));  // 40.0
    }
}
