/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeansarray;
import java.util.Scanner;
public class Modifikasi {

    static Scanner input = new Scanner(System.in);
    static int inputUkuran(String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }
    
    // Method input data mahasiswa
    static void inputData(String[][][] data) {
        input.nextLine();

        for (int i = 0; i < data.length; i++) {
            System.out.println("Program Studi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Kelas " + (j + 1));
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("Nama mahasiswa ke-" + (k + 1) + " : ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }
    }

    // Method menampilkan data mahasiswa
    static void tampilData(String[][][] data) {
        System.out.println("=== DATA MAHASISWA ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Program Studi: " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Kelas: " + (j + 1) + " : ");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " / ");
                }
                System.out.println();
            }
        }
    }

    // Method string
    static void operasiString(String[][][] data) {
        input.nextLine();
        
        System.out.print("Masukkan nama yang ingin dicari: ");
        String cari = input.nextLine();
        boolean ditemukan = false;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    if (data[i][j][k].equalsIgnoreCase(cari)) {
                        System.out.println("Nama ditemukan: " + data[i][j][k]);
                        System.out.println("Program Studi " + (i + 1)+ ", Kelas " + (j + 1));
                        ditemukan = true;
                    }
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Nama mahasiswa tidak ditemukan.");
        }

        System.out.println(
            "Nama dalam huruf kapital: " + cari.toUpperCase()
        );
        System.out.println(
            "Jumlah karakter nama: " + cari.length()
        );
    }

    public static void main(String[] args) {

        System.out.println("=== INPUT UKURAN ARRAY ===");

        int prodi = inputUkuran("Jumlah program studi: ");
        int kelas = inputUkuran("Jumlah kelas: ");
        int mahasiswa = inputUkuran("Jumlah mahasiswa per kelas: ");

        if (prodi <= 0 || kelas <= 0 || mahasiswa <= 0) {
            System.out.println("Ukuran array harus lebih dari 0.");
            return;
        }

        String[][][] dataMahasiswa =
            new String[prodi][kelas][mahasiswa];

        inputData(dataMahasiswa);
        tampilData(dataMahasiswa);
        operasiString(dataMahasiswa);
    }
}