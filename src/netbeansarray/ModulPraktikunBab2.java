package ModulPraktikumPemdas;

//Identitas Diri
//NIM 09010626038
//NAMA Zora Ufuqil Aliyah
//Modul Praktikum Bab 2

import java.util.Scanner;
public class ModulPraktikunBab2 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama donatur : ");
        String nama = input.nextLine();

        System.out.print("Jenis donatur : ");
        String jenis = input.nextLine();

        System.out.print("Jumlah donasi : Rp");
        double donasi = input.nextDouble();

        input.nextLine();

        System.out.print("Kode transaksi : ");
        String kode = input.nextLine();

        System.out.print("Donasi anonim? (true/false): ");
        boolean anonim = input.nextBoolean();

        System.out.println("\n=== DATA DONASI ===");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Donasi : Rp" + donasi);
        System.out.println("Kode : " + kode);
        System.out.println("Anonim : " + anonim);

        input.close();
    }
}

    
