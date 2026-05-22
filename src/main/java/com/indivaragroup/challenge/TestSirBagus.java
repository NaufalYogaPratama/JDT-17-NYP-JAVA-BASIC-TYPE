package com.indivaragroup.challenge;

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
            durasi += 24;
        }

        if (durasi == 0) {
            durasi = 1;
        }

        int biayaParkir = 0;

        if (jenis.equalsIgnoreCase("Mobil")) {
            if (durasi <= 1) {
                biayaParkir = parkirMobilSejam;
            } else {
                biayaParkir = parkirMobilSejam + ((durasi - 1) * parkirMobilAfterSejam);
            }

            if (biayaParkir > maxParkirMobil) {
                biayaParkir = maxParkirMobil;
            }

            System.out.println("Biaya parkir mobil Anda : Rp " + biayaParkir);
        }

        else if (jenis.equalsIgnoreCase("Motor")) {
            if (durasi <= 1) {
                biayaParkir = parkirMotorSejam;
            } else {
                biayaParkir = parkirMotorSejam + ((durasi - 1) * parkirMotorAfterSejam);
            }

            if (biayaParkir > maxParkirMotor) {
                biayaParkir = maxParkirMotor;
            }

            System.out.println("Biaya parkir motor Anda : Rp " + biayaParkir);
        }
        else {
            System.out.println("Jenis kendaraan tidak dikenali.");
        }
    }

    public static void main(String[] args) {
        parkingSystem("Mobil", 23, 23);
    }
}