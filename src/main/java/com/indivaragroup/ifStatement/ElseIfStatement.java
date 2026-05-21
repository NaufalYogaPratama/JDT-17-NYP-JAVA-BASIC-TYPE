package com.indivaragroup.ifStatement;

public class ElseIfStatement {
    public static void elseIfStatement (int value) {
        int nilai = value;

        if (nilai > 90){
            System.out.println("A");
        } else if (nilai >= 75) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        };
    }

    public static void main(String[] args) {
        elseIfStatement(100);
    }
}

