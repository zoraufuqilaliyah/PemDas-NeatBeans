/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MandiriTugas;
import java.util.Scanner;
public class TugasMandiri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU BELAJAR ANDI ===");
        System.out.println("1. Operasi Pertambahan");
        System.out.println("2. Operasi Pengurangan");
        System.out.println("3. Operasi Pembagian");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = input.nextInt();

        System.out.println("-------------------------");
        System.out.print("Andi belajar ");

        // Logika Switch-Case sesuai studi kasus
        switch (pilihan) {
            case 1:
                System.out.println("matematika: operasi pertambahan.");
                break;
            case 2:
                System.out.println("matematika: operasi pengurangan.");
                break;
            case 3:
                System.out.println("matematika: operasi pembagian.");
                break;
            default:
                // Menangani kondisi "diluar pilihan"
                System.out.println("perkalian.");
                break;
        }
    }
}