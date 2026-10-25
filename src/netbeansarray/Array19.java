/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeansarray;
import java.util.Scanner;
public class Array19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Masukkan total pertemuan: ");
        int totalPertemuan = input.nextInt();

        if (jumlahMahasiswa <= 0 || totalPertemuan <= 0) {
            System.out.println("Input harus lebih dari 0!");
            input.close();
            return;
        }

        int[] hadir = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan jumlah hadir mahasiswa ke-"
                    + (i + 1) + ": ");
            hadir[i] = input.nextInt();

            if (hadir[i] < 0 || hadir[i] > totalPertemuan) {
                System.out.println("Jumlah hadir harus antara 0 sampai "
                        + totalPertemuan + "!");

                input.close();
                return;
            }
        }

        System.out.println("\n=== HASIL KEHADIRAN MAHASISWA ===");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            double persentase =
                    (double) hadir[i] / totalPertemuan * 100;

            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.println("Jumlah hadir: " + hadir[i]);
            System.out.printf("Persentase: %.2f%%\n", persentase);

            if (persentase >= 75) {
                System.out.println("Status: Memenuhi minimal 75%");
            } else {
                System.out.println("Status: Tidak memenuhi minimal 75%");
            }
        }

        input.close();
    }
}