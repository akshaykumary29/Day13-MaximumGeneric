package com.bridgelabz.maximum;

/**
 * Find Maximum problem using Generics
 * @param <E>
 */
public class Maximun<E extends Comparable> {
    E value1, value2, value3;

    // Use Contuctor
    public Maximun(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E testMaximum(E value1, E value2, E value3) {
        E testMax = testMaximum(this.value1, this.value2, this.value3);
        return testMax;
    }

    /**
     * To Use the Generic
     * @param value1
     * @param value2
     * @param value3
     * @param <E>
     * @return
     */
    private static <E extends Comparable> E getmaximum(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
            max = value2;
        else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
            max = value3;
        //System.out.println(max);
        printMaximum(value1, value2, value3, max);
        return max;
    }

    //
    private static <E> void printMaximum(E value1, E value2, E value3, E max) {
        System.out.println("Maximum of " + value1 + ", " + value2 + ", " + value3 + " is : " + max);
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics");
        Maximun.getmaximum(10, 20, 30);
        Maximun.getmaximum("Apple", "Peach", "Banana");
        Maximun.getmaximum(11.11, 20.20, 30.30);
    }
}
