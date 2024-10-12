package Tugas.sesi3;

import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        // buat scanner nerima input
        Scanner scanner = new Scanner(System.in);

        // input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        // input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // pilihan operasi
        System.out.println("Pilih operasi perhitungan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        // Variabel buat nyimpen hasil
        double hasil = 0;

        // Proses perhitungan 
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                // biar gaada pembagian dari 0
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid. Harap pilih antara 1 hingga 4.");
        }

        
        scanner.close();
    }
}

