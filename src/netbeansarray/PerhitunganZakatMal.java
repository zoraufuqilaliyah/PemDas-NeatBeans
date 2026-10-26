/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//ZORA UFUQIL ALIYAH
//09010626038

package SubCPMK2New;
import java.util.Scanner;
public class PerhitunganZakatMal { //case 1
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total harta: ");
        double harta = input.nextDouble();
        
        System.out.print("Masukkan nilai nisab: ");
        double nisab = input.nextDouble();
        
        if (harta >= nisab) {
            double zakat = harta * 0.025;
            System.out.println("Zakat = " + zakat);
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }
    }
}