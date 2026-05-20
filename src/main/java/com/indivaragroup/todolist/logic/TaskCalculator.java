package com.indivaragroup.todolist.logic;

public class TaskCalculator {

    // Menggunakan Switch Case untuk menentukan persentase status
    public double getStatusPercentage(String status) {
        double percentage;
        switch (status) {
            case "Open":
                percentage = 0.0;
                break;
            case "In Progress":
                percentage = 50.0;
                break;
            case "Ready Review":
                percentage = 80.0;
                break;
            case "Done":
                percentage = 100.0;
                break;
            case "Cancelled":
                percentage = 0.0; // Cancelled tidak dihitung
                break;
            default:
                percentage = 0.0;
        }
        return percentage;
    }

    // Menghitung Variance (Actual Hour - Estimated Hour)
    public int calculateVariance(int estimated, int actual) {
        return actual - estimated;
    }

    // Menghitung Produktivitas ((Estimated / Actual) * 100)
    public double calculateProductivity(int estimated, int actual) {
        // Menggunakan If-Else untuk mencegah error dibagi nol (ArithmeticException)
        if (actual == 0) {
            return 0.0;
        } else {
            return ((double) estimated / actual) * 100.0;
        }
    }

    // Cek apakah task aktif untuk hitung Workload
    public boolean isActiveTask(String status) {
        // Task aktif adalah Open, In Progress, dan Ready Review
        if (status.equals("Open") || status.equals("In Progress") || status.equals("Ready Review")) {
            return true;
        } else {
            return false;
        }
    }
}
