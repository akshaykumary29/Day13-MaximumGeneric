package com.bridgelabz.maximum;

public class Maximun {
    public static Float getmaximum(Float value1, Float value2, Float value3) {
        Float max = value1;
        if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
            max = value2;
        else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
            max = value3;
        System.out.println(max);
        return max;
    }
}

