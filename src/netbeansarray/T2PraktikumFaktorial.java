/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPerulangan;
import java.util.Scanner;
public class T2PraktikumFaktorial {

    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        long faktorial = 1;

        System.out.print(n + "! = ");
        
        for (int i = n; i >= 1; i--) {
            faktorial *= i; // Perkalian akumulatif

            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println(n + "! = " + faktorial);

        input.close();
    }
}