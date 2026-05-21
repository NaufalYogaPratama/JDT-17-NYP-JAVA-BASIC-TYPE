package com.indivaragroup.challenge;

public class TestBangBagus {
    public static void testBangBagus (){
        int nilaiTugas = 90;
        int nilaiUjian = 90;
        int absensi = 95;

        int rataRata = (nilaiTugas + nilaiUjian + absensi) / 3;

        if (rataRata > 90){
            System.out.println("GG Bang");
        }
        if (rataRata > 75 && rataRata <= 90){
            System.out.println("Selamat Anda Lulus");
        }
        if (rataRata >= 65 && rataRata <= 75) {
            System.out.println("Remidi YA");
        }
        if (rataRata < 65) {
            System.out.println("Ngulang taun depan");
        }

        // if nested
//        if (rataRata > 75) {
//            if (rataRata > 90) {
//                System.out.println("GG Bang");
//            }
//            System.out.println("Selamat Anda Lulus");
//        }
//
//        if (rataRata <= 75) {
//            if (rataRata >= 65) {
//                System.out.println("Remidi YA");
//            }
//
//            if (rataRata < 65) {
//                System.out.println("Ngulang taun depan");
//            }
//        }
    }

    public static void main(String[] args) {
        testBangBagus();
    }
}
