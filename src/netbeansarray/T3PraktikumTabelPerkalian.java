/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class T3PraktikumTabelPerkalian {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka perkalian");
        int angka = input.nextInt();
        for (int i=1; i<=10; i++){
            int hasil = angka * i;
        System.out.println(angka + "X" + i + "=" + hasil);
        }
    }
}