package com.indivaragroup.expression;

public class Expression {
    public static void expression (){
        int a = 10;
        int b = 5;

        int hasil1 = a + b;
        boolean hasil2 = a > b;
        String hasil3 = "Halo" + "Dunia";
        int hasil4 = (a * 2) - b;
        double hasil5 = Math.sqrt(16);

        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
        System.out.println(hasil5);

        int total = (3 + 7) * 2;
        boolean cek = (10 % 2) == 0;
        String nama = "Java".toUpperCase();

        System.out.println(total);
        System.out.println(cek);
        System.out.println(nama);
    }
}
