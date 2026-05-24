package com.indivaragroup.method;

public class MethodReturnValue {
    public static void main(String[] args) {

        var total = sum(100, 100);
        System.out.println(total);

        System.out.println(sum(120,120));

        System.out.println(hitung(100, "+", 25));

    }

    static int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    static int hitung(int angka1, String operasi, int angka2) {
        switch (operasi) {
            case "+": return angka1 + angka2;
            case "-": return angka1 - angka2;
            default: return 0;
        }
    }
}
