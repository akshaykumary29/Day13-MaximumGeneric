package com.bridgelabz.maximum;

public class Maximun {
    // Refactor to generic method
    public static <E extends Comparable> E getmaximum(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
            max = value2;
        else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
            max = value3;
        System.out.println(max);
        return max;
    }
}

