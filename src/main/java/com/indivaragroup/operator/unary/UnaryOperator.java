package com.indivaragroup.operator.unary;

public class UnaryOperator {
    public void unaryOperator (){
        int a =5;

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

        int b = -a;

        System.out.println(b);
        boolean isTrue = false;
        System.out.println(!isTrue);
    }
}
