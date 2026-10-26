//Identitas Diri
//NIM 09010626038
//NAMA Zora Ufuqil Aliyah
//Modul Praktikum Bab 1

package ModulPraktikumPemdas;
import java.util.Scanner;

public class ModulPraktikumBab1 { //airWudhu  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        System.out.print("Jumlah mahasiswa : "); 
        int jumlahMahasiswa = input.nextInt(); 

        System.out.print("Frekuensi wudhu : "); 
        int frekuensiWudhu = input.nextInt(); 

        System.out.print("Air per wudhu (liter) : "); 
        double airPerWudhu = input.nextDouble(); 
        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu; 
        double penghematan = totalAir * 15 / 100; 
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air = "+ totalAir + " liter"); 

        input.close(); 
    } 
}