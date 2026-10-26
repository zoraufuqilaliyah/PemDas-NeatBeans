/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class Case3MenuProgam {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            System.out.println(); // Baris baru untuk kerapian

            switch (pilihan) {
                case 1:
                    System.out.println("--- Menampilkan Angka 1-10 ---");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("--- Menampilkan Bilangan Genap (1-10) ---");
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("--- Menghitung Jumlah 1-10 ---");
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i;
                    }
                    System.out.println("Hasil penjumlahan 1 hingga 10 = " + total);
                    break;

                case 4:
                    System.out.println("--- Menggambar Segitiga Bintang ---");
                    // nested loop untuk pola bintang
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break; 

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1-5.");
            }
            
            if (pilihan == 5) {
                break;
            }

        } while (true);

        input.close();
    }
}