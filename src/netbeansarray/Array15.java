/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package netbeansarray;
public class Array15 {

    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 85, 70};

        int cari = 90;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ditemukan = true;
                break;
}
}

        if (ditemukan) {
            System.out.println("Data ditemukan");
        } else {
        System.out.println("Data tidak ditemukan");
    }   
}
}