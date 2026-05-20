package com.indivaragroup.calculation.conversion.data.type;

public class ConversionDataType {
    public static void conversionDataType(){
        //Widening
        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;

        System.out.println("\nWidening Casting");
        System.out.println("byte -> int   = " + intValue);
        System.out.println("int -> double = " + doubleValue);

        //Narrowing
        double nilaiDouble = 9.78;
        int nilaiInt = (int) nilaiDouble;
        byte nilaiByte = (byte) nilaiInt;

        System.out.println();
        System.out.println("Narrowing Casting: ");
        System.out.println("double -> int   = " + nilaiInt);
        System.out.println("int    -> byte  = " + nilaiByte);
    }
}
