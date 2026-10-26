/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class CLGPolaDinamis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input tinggi
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        // Perulangan pencetak segitiga
        for (int i = 1; i <= tinggi; i++) {
            // Spasi 
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            // Bintang7
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}