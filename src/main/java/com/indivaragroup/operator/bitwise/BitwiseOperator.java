package com.indivaragroup.operator.bitwise;

public class BitwiseOperator {
    public static void bitwiseOperator (){
        int a = 5; //0101
        int b = 3; //0011

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a); //1010
        System.out.println(a << 1); //1010
        System.out.println(a >> 1); //0001
    }
}
