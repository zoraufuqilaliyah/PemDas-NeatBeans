/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class SKTantanganPersegiPanjang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan jumlah baris: ");
        int baris = scanner.nextInt();
        
        System.out.print("Masukan jumlah baris: ");
        int kolom = scanner.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= baris; i++){
            
            for (int j = 1; j <= baris; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }  
}