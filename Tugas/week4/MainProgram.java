package Tugas.sesi4;

import java.util.Scanner;

public class MainProgram  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // menu pilihan
        System.out.println("Pilih jenis perulangan:");
        System.out.println("1. If");
        System.out.println("2. For");
        System.out.println("3. While");
        System.out.println("4. Do-While");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                contohIf();
                break;
            case 2:
                contohFor();
                break;
            case 3:
                contohWhile();
                break;
            case 4:
                contohDoWhile();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }

    // Program if 
    public static void contohIf() {
        int angka = 10;
        
        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5");
        }

        if (angka % 2 == 0) {
            System.out.println("Angka adalah bilangan genap");
        } else {
            System.out.println("Angka adalah bilangan ganjil");
        }

        if (angka > 0 && angka <= 10) {
            System.out.println("Angka berada dalam rentang 1 hingga 10");
        } else {
            System.out.println("Angka di luar rentang yang diharapkan");
        }
    }

    // Program for
    public static void contohFor() {
        System.out.println("Perulangan dari 1 sampai 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Angka: " + i);
        }

        System.out.println("\nMenggunakan for untuk iterasi array:");
        int[] angkaArray = {10, 20, 30, 40, 50};
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angkaArray[i]);
        }

        System.out.println("\nMenggunakan for-each untuk iterasi array:");
        for (int angka : angkaArray) {
            System.out.println("Angka: " + angka);
        }
    }

    // Program while
    public static void contohWhile() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Angka: " + i);
            i++;
        }
    }

    // Program do-while 
    public static void contohDoWhile() {
        int i = 1;
        do {
            System.out.println("Angka: " + i);
            i++;
        } while (i <= 5);
    }
}
