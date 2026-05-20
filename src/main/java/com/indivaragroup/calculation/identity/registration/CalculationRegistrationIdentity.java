package com.indivaragroup.calculation.identity.registration;

public class CalculationRegistrationIdentity {
    public void processKtpRegistration(int uangSaya) {
        int biayaKtp = 5000;

        System.out.println("Uang awal saya: " + uangSaya);

        if (uangSaya == 10000) {
            System.out.println("Karena saya punya uang 10.000, saya harus buat KTP.");
            System.out.println("Saya harus bayar biaya pembuatan KTP sebesar: " + biayaKtp);

            uangSaya = uangSaya - biayaKtp;

            System.out.println("Sisa uang saya sekarang adalah: " + uangSaya);
        } else {
            System.out.println("Uang saya tidak 10.000, jadi saya tidak perlu buat KTP.");
        }
    }
}
