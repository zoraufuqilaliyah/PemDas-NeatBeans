/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netbeansarray;
import java.util.Scanner;
public class Array17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ":");
            nilai[i] = input.nextInt();
}

        int max = nilai[0];
        int min = nilai[0];
    
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
}

        double rataRata = (double) total / nilai.length;
        System.out.println("\n=== HASIL ===");
        System.out.println("Total =" + total);
        System.out.println("Rata-rata =" + rataRata);
        System.out.println("Nilai tertinggi =" + max);
        System.out.println("Nilai terendah =" + min);
    }   
}