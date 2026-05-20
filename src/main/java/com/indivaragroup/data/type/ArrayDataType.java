package com.indivaragroup.data.type;

import java.util.Arrays;

public class ArrayDataType {
    public void arrayData() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int nilaiData = data[1][2];
        System.out.println("\nnilai spesifik data[1][2] = " + nilaiData);

        int[][] matrix = new int[2][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;

        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        System.out.println("\n=== Isi Array 'data' ===");
        for (int baris = 0; baris < data.length; baris++) {
            for (int kolom = 0; kolom < data[baris].length; kolom++) {
                System.out.print(data[baris][kolom] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Isi Array 'matrix' ===");
        for (int baris = 0; baris < matrix.length; baris++) {
            for (int kolom = 0; kolom < matrix[baris].length; kolom++) {
                System.out.print(matrix[baris][kolom] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Cara Cepat (DeepToString) ===");
        System.out.println("Data: " + Arrays.deepToString(data));
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }
}
