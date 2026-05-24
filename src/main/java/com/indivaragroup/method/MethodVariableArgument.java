package com.indivaragroup.method;

public class MethodVariableArgument {
    public static void main(String[] args) {
        //WITHOUT VarArgs
        int[] values = {80, 80, 80, 80, 80};
        sayCongrats("Naufal", values);

        //WITH VarArgs
        sayCongratsVarArgs("Joko", 0, 0, 90,80);
    }

    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (int value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus ");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    //VARIABLE ARGUMENT
    static void sayCongratsVarArgs(String name, int... values) {
        var total = 0;
        for (int value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus ");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
