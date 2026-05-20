package com.indivaragroup.calculation.report.students;

public class ScoringStudents {

    public void processAllStudents() {
        System.out.println("\n=== Sistem Penilaian JDT-17 ===");

        String[] listNames = {
                "Naufal", "Atik", "Budi", "Citra", "Deni",
                "Eka", "Fajar", "Gita", "Hadi", "Intan",
                "Joko", "Kiki", "Lia", "Mira", "Nana",
                "Oka", "Putra"
        };

        int[] listScores = {
                100, 95, 75, 60, 90,
                85, 70, 50, 100, 92,
                77, 65, 88, 72, 55,
                98, 69
        };

        int index = 0;

        // Looping for-each dipindahkan ke sini
        for (String studentName : listNames) {
            int studentScore = listScores[index];
            evaluateStudent(studentName, studentScore); // Panggil method evaluasi di bawah
            index++;
        }
    }

    private void evaluateStudent(String name, int score) {
        String result = "";

        if (score == 100) {
            result = "dia jago banget";
        } else if (score >= 90) {
            result = "dia belum jago banget tapi jago aja";
        } else if (score >= 70) {
            result = "dia b aja (biasa aja)";
        } else if (score < 70) {
            result = "perlu belajar lagi";
        }

        System.out.println("Nama Murid: " + name + " | Nilai: " + score + " -> Kesimpulan: " + result);
    }
}
