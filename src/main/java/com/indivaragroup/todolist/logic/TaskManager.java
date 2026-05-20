package com.indivaragroup.todolist.logic;

import com.indivaragroup.todolist.dto.TaskDTO;
import java.util.ArrayList;

public class TaskManager {

    public void runMiniProject() {
        // Inisialisasi Kalkulator Logic
        TaskCalculator calculator = new TaskCalculator();

        // Menggunakan Koleksi ArrayList untuk menyimpan daftar task
        ArrayList<TaskDTO> taskList = new ArrayList<>();

        // Memasukkan Dummy Data ke dalam koleksi
        taskList.add(new TaskDTO("TSK-01", "Backend API", "Naufal", "Done", 8, 10, 40.0));
        taskList.add(new TaskDTO("TSK-02", "Frontend UI", "Naufal", "In Progress", 10, 5, 30.0));
        taskList.add(new TaskDTO("TSK-03", "Testing", "Atik", "Open", 5, 0, 30.0));
        taskList.add(new TaskDTO("TSK-04", "Deploy", "Atik", "Cancelled", 2, 0, 0.0));

        System.out.println("====== TO DO LIST MVP REPORT ======\n");

        int totalWorkloadNaufal = 0;
        double totalProjectProgress = 0.0;

        // Looping menggunakan For-Each untuk membaca ArrayList
        for (TaskDTO task : taskList) {
            System.out.println("Task ID   : " + task.getTaskId() + " - " + task.getTitle());
            System.out.println("Assignee  : " + task.getAssignee());
            System.out.println("Status    : " + task.getStatus());

            // 1. Hitung Progress Berdasarkan Status & Bobot (MVP)
            double statusPercent = calculator.getStatusPercentage(task.getStatus());
            double weightedProgress = (task.getWeight() / 100.0) * statusPercent;
            totalProjectProgress = totalProjectProgress + weightedProgress;
            System.out.println("Progress  : " + statusPercent + "% (Kontribusi ke Project: " + weightedProgress + "%)");

            // 2. Hitung Workload (Hanya akumulasi jika task aktif)
            if (calculator.isActiveTask(task.getStatus()) && task.getAssignee().equals("Naufal")) {
                totalWorkloadNaufal = totalWorkloadNaufal + task.getEstimatedHour();
            }

            // 3. Performance Check (Variance & Productivity)
            // Hanya dihitung jika sudah ada pengerjaan / Done
            if (task.getStatus().equals("Done") || task.getStatus().equals("In Progress")) {
                int variance = calculator.calculateVariance(task.getEstimatedHour(), task.getActualHour());
                double productivity = calculator.calculateProductivity(task.getEstimatedHour(), task.getActualHour());

                System.out.println("Variance  : " + variance + " jam (Positif = Overtime, Negatif = Lebih cepat)");
                System.out.println("Productivity: " + String.format("%.2f", productivity) + " %");
            }

            System.out.println("-----------------------------------");
        }

        // Tampilkan Hasil Global (Akumulasi dari Looping)
        System.out.println("\n=== SUMMARY ===");
        System.out.println("Total Progress Project Keseluruhan : " + totalProjectProgress + " %");
        System.out.println("Total Workload Aktif (Naufal)      : " + totalWorkloadNaufal + " jam");
    }
}
