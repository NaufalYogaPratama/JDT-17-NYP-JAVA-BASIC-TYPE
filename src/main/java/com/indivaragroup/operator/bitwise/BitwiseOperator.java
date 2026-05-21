package com.indivaragroup.operator.bitwise;

public class BitwiseOperator {
    public static void bitwiseOperator (){
        int a = 5; //0101
        int b = 3; //0011

        System.out.println(a & b); //0001
        System.out.println(a | b); //0111
        System.out.println(a ^ b); //0110 XOR
        System.out.println(~a); //1010 Two`s complement
        System.out.println(a << 1); //1010
        System.out.println(a >> 1); //0001
    }
}
