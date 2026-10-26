/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//ZORA UFUQIL ALIYAH
//09010626038

package SubCPMK2New;
import java.util.Random;
import java.util.Scanner;
public class PermainanTebakAngka { //case 3
 
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
       
        int angkaRahasia = random.nextInt() + 1;
        int jumlahPercobaan = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Masukkan tebakan: ");
            int tebakan = input.nextInt();
            jumlahPercobaan++;
            
            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar");
            } else {
                System.out.println("Benar");
                break;
            }
        }
        
        System.out.println("Jumlah percobaan = " + jumlahPercobaan);
    }
}