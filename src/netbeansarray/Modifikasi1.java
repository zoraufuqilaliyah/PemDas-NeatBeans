package netbeansarray;
import java.util.Scanner;
import java.util.Arrays;
public class Modifikasi1 {

    static Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("----------------------------------------------");
        System.out.println("    PROGRAM PENDATAAN MAHASISWA (3D ARRAY)    ");
        System.out.println("-----------------------------------------------");

        int jumlahProdi = inputUkuranDimensi("Masukkan jumlah Program Studi: ");
        int jumlahKelas = inputUkuranDimensi("Masukkan jumlah Kelas per Prodi: ");
        int jumlahMahasiswa = inputUkuranDimensi("Masukkan jumlah Mahasiswa per Kelas: ");
        
        String[][][] dataMahasiswa = new String[jumlahProdi][jumlahKelas][jumlahMahasiswa];
        
        inputNamaMahasiswa(dataMahasiswa);
        tampilkanDataMahasiswa(dataMahasiswa);
        lakukanOperasiString(dataMahasiswa);
    }

    public static int inputUkuranDimensi(String pesan) {
        System.out.print(pesan);
        String inputBaris = input.nextLine();
        return Integer.parseInt(inputBaris); 
    }
    public static void inputNamaMahasiswa(String[][][] data) {
        System.out.println("--------------------------------------");
        System.out.println("    Proses Input Nama Mahasiswa    ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  Kelas " + (j + 1));
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("    Nama Mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }
    }

    public static void tampilkanDataMahasiswa(String[][][] data) {
        System.out.println("--------------------------------------");
        System.out.println("        Hasil Output Pendataan        ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi" + (i + 1)); 
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Kelas" + (j + 1) + " "); 
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " "); 
                }
                System.out.println(); 
                        
            }
        }
    }

public static void lakukanOperasiString(String[][][] data) {
    System.out.println("-------------------------------");
    System.out.println("   Analisis & Operasi String   ");
    System.out.println("-------------------------------");
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama : ");
    String sampelNama = input.nextLine();
    
    if (!sampelNama.trim().isEmpty()) {
        System.out.println("1. Mengubah ke Huruf Kapital (toUpperCase) : " + sampelNama.toUpperCase());
        System.out.println("2. Menghitung Panjang Karakter (length)     : " + sampelNama.length() + " karakter");
        
        String[] kumpulanKata = sampelNama.trim().split("\\s+");
        int jumlahKata = kumpulanKata.length;
        System.out.println("3. Jumlah Kata (split)                      : " + jumlahKata + " kata");
        
        StringBuilder hasilKapital = new StringBuilder();
        for (String kata : kumpulanKata) {
            if (!kata.isEmpty()) {
                hasilKapital.append(kata.substring(0, 1).toUpperCase())
                            .append(kata.substring(1))
                            .append(" ");
            }
        }
        System.out.println("4. Huruf Pertama Kapital                    : " + hasilKapital.toString().trim());

    } else {
        System.out.println("Data kosong. Tidak ada data yang dimasukkan.");
    }

        System.out.println("--------------------------------------");
        System.out.println("         Pengecek Anagram            ");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua  : ");
        String kata2 = input.nextLine();

        String kataBersih1 = kata1.replaceAll("\\s+", "").toLowerCase();
        String kataBersih2 = kata2.replaceAll("\\s+", "").toLowerCase();

        boolean apakahAnagram = false;

        if (kataBersih1.length() == kataBersih2.length()) {
            char[] arrayChar1 = kataBersih1.toCharArray();
            char[] arrayChar2 = kataBersih2.toCharArray();

            Arrays.sort(arrayChar1);
            Arrays.sort(arrayChar2);

            apakahAnagram = Arrays.equals(arrayChar1, arrayChar2);
        }
            if (apakahAnagram) {
            System.out.println("Hasil: \"" + kata1 + "\" dan \"" + kata2 + "\" adalah ANAGRAM!");
        } else {
            System.out.println("Hasil: \"" + kata1 + "\" dan \"" + kata2 + "\" BUKAN anagram.");
        }
       
        input.close();
    }
}