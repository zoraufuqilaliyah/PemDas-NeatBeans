/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class CLGPolaBintang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        // do-while 
        do {
            System.out.println("\n===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            // Meminta tinggi pola
            int tinggi = 0;
            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextInt();
            }

            // switch-case
            switch (pilihan) {
                case 1:
                    // 1. Segitiga
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // 2. Segitiga Terbalik
                    for (int i = tinggi; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // 3. Persegi
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= tinggi; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // 4. Piramida
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = tinggi; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // 5. Progam Diamond
                    // Bagian Atas
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = tinggi; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // Bagian Bawah
                    for (int i = tinggi - 1; i >= 1; i--) {
                        for (int j = tinggi; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    // break
                    System.out.println("Terima kasih, program selesai!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 6); // Loop 

        input.close();
    }
}