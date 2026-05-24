package com.indivaragroup.method;

public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

//        loop(10000);      --> error (kebanyakan)
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    //RECURSIVE METHOD
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value -1);
        }
    }

    //Stack Overflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value -1);
        }
    }
}
