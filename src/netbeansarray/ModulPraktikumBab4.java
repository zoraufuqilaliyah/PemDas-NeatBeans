/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Identitas Diri
//NIM 09010626038
//NAMA Zora Ufuqil Aliyah
//Modul Praktikum Bab 4

package ModulPraktikumPemdas;
import java.util.Scanner;
public class ModulPraktikumBab4 {
    
    public static void main (String[] args){
        Scanner input =new Scanner (System.in);
        
        System.out.print("TPK :");
        double ipk = input.nextDouble();
        
        System.out.print("Hafalan (juz) : ");
        int hafalan = input.nextInt();
        
        if (ipk >= 3.25 && hafalan >= 5){
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
        }
        
        input.close();
        }
}