/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Identitas Diri
//NIM 09010626038
//NAMA Zora Ufuqil Aliyah
//Modul Praktikum Bab 5

package ModulPraktikumPemdas;
import java.util.Scanner;
public class ModulPraktikumBab5 {
    
    public static void main(String[]  args){
        Scanner input = new Scanner(System.in);
        
        double ipk;
        double penghasilan;
        double tanggungan;
        String aktifSosial;
        String beasiswaLain;
        
        System.out.print("Masukan ipk: ");
        ipk = input.nextDouble();
        
        System.out.print("Masukan penghasilan orang tua: ");
        penghasilan = input.nextDouble();
        
        System.out.print("Masukan jumlah tanggungan: ");
        tanggungan = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Aktif kegiatan sosial ? (ya/tidak): ");
        aktifSosial = input.nextLine();
        
        System.out.print("Menerima beasiswa lain ? (ya/tidak): ");
        beasiswaLain = input.nextLine();
        
        if (ipk >= 3.50
                && penghasilan <= 3000000
                && tanggungan > 3
                && beasiswaLain.equalsIgnoreCase("tidak")){
            
        } else if (ipk >= 3.00
                && penghasilan <= 5000000
                && beasiswaLain.equalsIgnoreCase("tidak")){
            
            System.out.println("Prioritas kedua");
            
        } else if (aktifSosial.equalsIgnoreCase("ya")
                && ipk >= 3.00
                && beasiswaLain.equalsIgnoreCase("tidak")){
            
            System.out.println("Perimbangan Khusus");
            
        } else {
            
            System.out.println("Belum memenuhi prioritas");
        }      
    }
}