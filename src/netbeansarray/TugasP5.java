/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class TugasP5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("Program selesai.");
    }
}