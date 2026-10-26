/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class Case1SimulasiTabungan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

        int totalTabungan = 0;
        int bulanMencapai1Juta = -1;

        System.out.println("\n--- Rincian Tabungan Setiap Bulan ---");

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            
            int tabunganBulanIni = 100000 + (bulan - 1) * 50000;
            
            totalTabungan += tabunganBulanIni;

            System.out.printf("Bulan %d = Rp%,d%n", bulan, tabunganBulanIni);

            if (totalTabungan >= 1000000 && bulanMencapai1Juta == -1) {
                bulanMencapai1Juta = bulan;
            }
        }
        System.out.printf("%nTotal tabungan: Rp%,d%n", totalTabungan);

        if (bulanMencapai1Juta != -1) {
            System.out.println("Total tabungan pertama kali mencapai Rp1.000.000 pada bulan ke-" + bulanMencapai1Juta);
        } else {
            System.out.println("Total tabungan belum mencapai Rp1.000.000 dalam " + jumlahBulan + " bulan.");
        }
        input.close();
    }
}