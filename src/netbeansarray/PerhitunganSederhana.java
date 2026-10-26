/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// ZORA UFUQIL ALIYAH
// 09010626038

package SubCPMK3New;
import java.util.Scanner;
public class PerhitunganSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double angka1, angka2, hasil;
        char operasi;

        System.out.println("=== PROGRAM KALKULATOR SEDERHANA ===");
        
        // Input angka pertama
        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextDouble();
        
        // Input operator matematika
        System.out.print("Masukkan operator (+, -, *, /): ");
        operasi = input.next().charAt(0); // Mengambil karakter pertama dari input teks
        
        // Input angka kedua
        System.out.print("Masukkan angka kedua   : ");
        angka2 = input.nextDouble();

        System.out.println("------------------------------------");

        // Proses logika percabangan untuk perhitungan
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
                
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
                
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
                
            case '/':
                // Validasi agar tidak terjadi pembagian dengan angka 0
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan!");
                }
                break;
                
            default:
                System.out.println("Error: Operator yang Anda masukkan salah!");
                break;
        }
    }
}