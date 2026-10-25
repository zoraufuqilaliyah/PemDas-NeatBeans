/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeansarray;
import java.util.Scanner;
public class Array20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();

        if (jumlahProduk <= 0) {
            System.out.println("Jumlah produk harus lebih dari 0!");
            input.close();
            return;
        }

        double[] harga = new double[jumlahProduk];
        double total = 0;
        double tertinggi;
        double terendah;

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print("Masukkan harga produk ke-" + (i + 1) + ": Rp");
            harga[i] = input.nextDouble();

            if (harga[i] < 0) {
                System.out.println("Harga tidak boleh negatif!");
                input.close();
                return;
            }
        }

        tertinggi = harga[0];
        terendah = harga[0];

        System.out.println("\n=== DATA PRODUK UMKM ===");

        for (int i = 0; i < jumlahProduk; i++) {
            double diskon = 0;
            double hargaAkhir = harga[i];

            if (harga[i] >= 30000) {
                diskon = harga[i] * 10 / 100;
                hargaAkhir = harga[i] - diskon;
            }

            System.out.println("\nProduk ke-" + (i + 1));
            System.out.printf("Harga awal  : Rp%.0f%n", harga[i]);
            System.out.printf("Diskon      : Rp%.0f%n", diskon);
            System.out.printf("Harga akhir : Rp%.0f%n", hargaAkhir);

            total += harga[i];

            if (harga[i] > tertinggi) {
                tertinggi = harga[i];
            }

            if (harga[i] < terendah) {
                terendah = harga[i];
            }
        }

        double rataRata = total / jumlahProduk;

        System.out.println("\n=== RINGKASAN PENJUALAN ===");
        System.out.printf("Total harga     : Rp%.0f%n", total);
        System.out.printf("Rata-rata harga : Rp%.2f%n", rataRata);
        System.out.printf("Harga tertinggi : Rp%.0f%n", tertinggi);
        System.out.printf("Harga terendah  : Rp%.0f%n", terendah);

        input.close();
    }
}