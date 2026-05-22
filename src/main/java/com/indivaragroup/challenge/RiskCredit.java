package com.indivaragroup.challenge;

/*
 *
 * kita mau bikin sistem kredit rumah
 * input; gaji, umur, tenor, harga rumah, cicilan per bulan (harga rumah / (lama cicilan * 12))
 *
 * requirements:
 * umur < 21 tahun (ditolak) v
 * lama cicilan > 20 tahun (ditolak) v
 * cicilan perbulan < gaji * 40/100 (ditolak) v
 *
 * gaji > 15jt
 * cicilan perbulan <= 30% gaji -> high value kreditor (approve) v
 *
 * gaji 7jt - 14.999.999 & umur > 25 (approve) v
 *
 * umur 21 - 24 -> butuh penjamin v
 *
 * gaji < 7jt & cicilan >= 15 tahun (high risk credit)
 *
 * else pengajuannya boleh dipertimbangkan
 *
 * test case:
 * umur 24 gaji 25jt cicilan 16 tahun harga 1M -> high value butuh penjamin langsung diterima approvalnya
 *
 * output:
 * di approve atau tidak kemudian butuh penjamin atau tidak dan high risk credit atau high value
 *
 * */

public class RiskCredit {
    public static void riskCreditCalc (long gaji, int umur, long hargaRumah, int lamaCicilan){
        long cicilan = hargaRumah / (lamaCicilan * 12);

        boolean isApproved = false;
        boolean isReject = false;
        boolean butuhPenjamin = false;
        String profil_risiko = "Normal";

        if (umur < 21 || lamaCicilan > 20 || cicilan > (gaji * 40/100)) {
            isReject = true;
        }
        else {
            if (umur >= 21 && umur <= 24) {
                butuhPenjamin = true;
            }

            if (gaji > 15_000_000 && cicilan <= (gaji * 30/100)) {
                isApproved = true;
                profil_risiko = "High Value Kreditor";
            } else if (gaji >= 7_000_000 && gaji <= 14_999_999 && umur >= 25) {
                isApproved = true;
            } else if (gaji < 7_000_000 && lamaCicilan >= 15) {
                profil_risiko = "High Risk Credit";
            }
        }

        System.out.println("=== HASIL PENGAJUAN KREDIT ===");
        System.out.println("Cicilan per bulan: " + cicilan);

        if (isReject) {
            System.out.println("Status Pengajuan: DITOLAK");
        } else if (isApproved) {
            System.out.println("Status Pengajuan: APPROVED");
        } else {
            System.out.println("Status Pengajuan: Dipertimbangkan");
        }

        if (!isReject) {
            if (butuhPenjamin) {
                System.out.println("Status: BUTUH PENJAMIN");
            } else {
                System.out.println("Status: AMAN TANPA PENJAMIN");
            }

            System.out.println("Profil Resiko: " + profil_risiko);
        }
        System.out.println("-------------------------------\n");
    }

    public static void main(String[] args) {
        // Test Case 1 (Dari Soal):
        // Umur 24, gaji 25jt, cicilan 16 thn, harga 1M
        System.out.println("TEST CASE 1:");
        riskCreditCalc(25_000_000, 24, 1_000_000_000, 16);

        // Test Case 2:
        // Umur 20, gaji 50jt.
        System.out.println("TEST CASE 2:");
        riskCreditCalc(50_000_000, 20, 1_000_000_000, 10);

        // Test Case 3:
        // Gaji 6jt, umur 26, cicilan 15 thn, harga 300jt
        System.out.println("TEST CASE 3:");
        riskCreditCalc(6_000_000, 26, 300_000_000,  15);

        // Test Case 4:
        // Gaji 10jt, umur 30, cicilan 25 tahun.
        System.out.println("TEST CASE 4 (Ditolak karena Tenor):");
        riskCreditCalc(10_000_000, 30, 500_000_000, 25);

        // Test Case 5:
        // Gaji 10jt, umur 28, harga rumah 1M, tenor 10 thn (Cicilan ~8,3jt/bln)
        System.out.println("TEST CASE 5 (Ditolak karena Cicilan Terlalu Besar):");
        riskCreditCalc(10_000_000, 28, 1_000_000_000, 10);

        // Test Case 6:
        // Gaji 10jt, umur 28, harga 300jt, tenor 10 thn (Cicilan ~2,5jt)
        System.out.println("TEST CASE 6 (Approve Standar):");
        riskCreditCalc(10_000_000, 28, 300_000_000, 10);

        // Test Case 7:
        // Gaji 35jt, umur 30, harga 1M, tenor 10 thn (Cicilan ~8,3jt)
        System.out.println("TEST CASE 7 (High Value Tanpa Penjamin):");
        riskCreditCalc(35_000_000, 30, 1_000_000_000, 10);

        // Test Case 8:
        // Gaji 6jt, umur 26, harga 200jt, tenor 10 thn.
        System.out.println("TEST CASE 8 (Dipertimbangkan Normal):");
        riskCreditCalc(6_000_000, 26, 200_000_000, 10);

        // Test Case 9:
        // Gaji 10jt, umur 23, harga 300jt, tenor 10 thn.
        System.out.println("TEST CASE 9 (Gaji Standar tapi Umur Muda):");
        riskCreditCalc(10_000_000, 23, 300_000_000, 10);
    }
}
