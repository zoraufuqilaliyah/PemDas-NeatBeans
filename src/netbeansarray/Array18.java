/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netbeansarray;
import java.util.Scanner;
public class Array18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();

        int[] penjualan = new int[jumlahHari];

        int total = 0;
        int tertinggi;
        int terendah;
        int jumlahMinimal30 = 0;

        // Input data penjualan
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Penjualan hari ke-" + (i + 1) + ": ");
            penjualan[i] = input.nextInt();

            total += penjualan[i];

            if (penjualan[i] >= 30) {
                jumlahMinimal30++;
            }
        }

        // Menentukan penjualan tertinggi dan terendah
        tertinggi = penjualan[0];
        terendah = penjualan[0];

        for (int i = 1; i < jumlahHari; i++) {
            if (penjualan[i] > tertinggi) {
                tertinggi = penjualan[i];
            }

            if (penjualan[i] < terendah) {
                terendah = penjualan[i];
            }
        }

        double rataRata = (double) total / jumlahHari;

        // Menampilkan hasil
        System.out.println("\n=== HASIL PENJUALAN KANTIN ===");
        System.out.println("Total penjualan: " + total);
        System.out.println("Rata-rata penjualan: " + rataRata);
        System.out.println("Penjualan tertinggi: " + tertinggi);
        System.out.println("Penjualan terendah: " + terendah);
        System.out.println("Jumlah hari dengan penjualan minimal 30: "
                + jumlahMinimal30);

        input.close();
    }
}