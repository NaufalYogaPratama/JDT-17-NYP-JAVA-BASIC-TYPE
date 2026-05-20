package com.indivaragroup.data.type;

public class CharacterTypeData {
    public static void characterTypeData(){
        char huruf = 'A';
        char angka = '7';
        char simbol = '#';
        char spasi = ' ';

        System.out.println("\nHuruf   : " + huruf);
        System.out.println("Angka   : " + angka);
        System.out.println("Simbol   : " + simbol);
        System.out.println("Spasi   : [" + spasi + "]");

        //escape Sequence
        char newline = '\n';
        char tab = '\t';
        char quote = '\'';

        System.out.println("Escapse Sequence:");
        System.out.println("Baris 1" + newline + "Baris 2");
        System.out.println("Kolom1" + tab + "Kolom2");
        System.out.println("tanda Kutip: " + quote);
    }
}
