/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netbeansarray;
public class Array11 {

    public static void main(String[] args) {
    int[] nilai = {80, 75, 90, 85, 70};

    int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
}

    double rataRata = (double) total / nilai.length;
        System.out.println("Total =" + total);
        System.out.println("Rata-rata =" + rataRata);
    }
}