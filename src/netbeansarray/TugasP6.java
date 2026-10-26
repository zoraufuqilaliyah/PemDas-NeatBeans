/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class TugasP6 {
//Nilai >= 75 → Lulus
//Nilai < 75  → Tidak Lulus
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
           
            int nilai = input.nextInt();
            
            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                
            } else {
                System.out.println("Status: Tidak Lulus");
            }
        }
    }
}