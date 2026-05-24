package com.indivaragroup.method;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Naufal", "Pratama");
        sayHello("Joko", "Widodo");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Halo " + firstName + " " + lastName);
    }
}
