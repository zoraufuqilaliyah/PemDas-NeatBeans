//Identitas Diri
//NIM 09010626038
//NAMA Zora Ufuqil Aliyah
//Modul Praktikum Bab 3
package ModulPraktikumPemdas;
import java.util.Scanner;
public class ModulPraktikumBab3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();

        System.out.print("Beras per keluarga (kg): ");
        int berasPerKeluarga = input.nextInt();

        int jumlahKeluarga =
        totalBeras / berasPerKeluarga;

        int sisaBeras =
        totalBeras % berasPerKeluarga;

        System.out.println("\n=== HASIL DISTRIBUSI ===");
        System.out.println("Jumlah keluarga = " + jumlahKeluarga);
        System.out.println("Sisa beras = " + sisaBeras + " kg");

        input.close();
    }
}
    

