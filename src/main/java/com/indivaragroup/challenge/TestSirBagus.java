package com.indivaragroup.challenge;

//mau ngebuat sistem parkir -> dua jenis kendaraan 1. motor 2. mobil; untuk motor 1 jam pertama 5.000 dan jam-jam selanjutnya 3.000; untuk mobil harga satu jam pertamanya 8000 jam-jam selanjutnya 5000 -> max parkir motor 30k max mobil 50k -> ga pakai date pake integer (1-24)


import javax.imageio.stream.ImageInputStream;

public class TestSirBagus {
    public static void parkingSystem (String jenis, int masukParkir, int keluarParkir) {
        int parkirMotorSejam = 5000;
        int parkirMotorAfterSejam = 3000;
        int maxParkirMotor = 30000;

        int parkirMobilSejam = 8000;
        int parkirMobilAfterSejam = 5000;
        int maxParkirMobil = 50000;

        int durasi = keluarParkir - masukParkir;

        if (durasi < 0) {
            durasi +=24;
        }

        if (durasi == 0) {
            durasi = 1;
        }

        int biayaParkir = 0;

        if (jenis.equalsIgnoreCase("Mobil")){
            if (durasi <= 1){
                biayaParkir = parkirMotorSejam;
            } else {
                biayaParkir = parkirMobilSejam + ((durasi - 1) * parkirMobilAfterSejam);
            }
            if (biayaParkir > maxParkirMobil) {
                biayaParkir = maxParkirMobil;
            }
            System.out.println("Biaya parkir mobil Anda ; " + biayaParkir);
        };

        if (jenis.equalsIgnoreCase("Motor")) {
            if (durasi <= 1){
                biayaParkir = parkirMotorSejam;
            } else {
                biayaParkir = parkirMotorSejam + ((durasi - 1) * parkirMotorAfterSejam);
            }

            if (biayaParkir > maxParkirMotor){
                biayaParkir = maxParkirMotor;
            }
            System.out.println("Biaya parkir motor Anda ; " + biayaParkir);
        };
    }

    public static void main(String[] args) {
        parkingSystem("Mobil", 2, 23);
    }
}
