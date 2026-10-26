/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class Case2SistemPresensi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int totalMahasiswa = input.nextInt();

        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;

        System.out.println("\n--- Input Data Kehadiran (1 = Hadir, 0 = Tidak Hadir) ---");

        for (int i = 1; i <= totalMahasiswa; i++) {
            System.out.print("Kehadiran mahasiswa ke-" + i + ": ");
            int status = input.nextInt();

            if (status == 1) {
                jumlahHadir++;
            } else if (status == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid! Masukkan angka 1 atau 0.");
                i--;
            }
        }
        double persentase = ((double) jumlahHadir / totalMahasiswa) * 100;
            System.out.println("\n--- Ringkasan Kehadiran ---");
            System.out.println("Jumlah Hadir       : " + jumlahHadir);
            System.out.println("Jumlah Tidak Hadir : " + jumlahTidakHadir);
            System.out.printf("Persentase Kehadiran: %.2f%%\n", persentase);

        if (persentase >= 75) {
            System.out.println("Status              : Memenuhi syarat");
        } else {
            System.out.println("Status              : Tidak memenuhi syarat");
        }

        input.close();
    }
}