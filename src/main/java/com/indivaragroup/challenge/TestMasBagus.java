package com.indivaragroup.challenge;

public class TestMasBagus {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int c = ++a + b-- + a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 1;

        x += x++ + ++x;

        System.out.println(x);
    }
}
