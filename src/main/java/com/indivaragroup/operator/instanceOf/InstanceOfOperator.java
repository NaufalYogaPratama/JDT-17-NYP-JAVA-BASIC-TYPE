package com.indivaragroup.operator.instanceOf;

public class InstanceOfOperator {
    public static void instanceOfOperator (){
        Object value = "test";
        boolean isTrue = value instanceof String;

        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);
        System.out.println(!isTrue);
    }
}
