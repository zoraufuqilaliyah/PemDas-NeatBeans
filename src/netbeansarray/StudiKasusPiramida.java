/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
public class StudiKasusPiramida {

    public static void main(String[] args) {
         for (int i = 1; i <= 5; i++) {
            // Spasi
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}