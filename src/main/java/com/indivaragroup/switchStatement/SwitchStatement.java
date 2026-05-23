package com.indivaragroup.switchStatement;

public class SwitchStatement {
    public static void switchSample() {
        String cuaca = "Siang";

        switch (cuaca) {
            case "Siang":
                System.out.println("panas");
                break;
            case "Malam":
                System.out.println("dingin");
                break;
            default:
                System.out.println("hehe");
                break;
        }
    }
}
