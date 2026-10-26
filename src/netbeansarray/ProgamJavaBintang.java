package PraktikumPerulangan;
import java.util.Scanner;
public class ProgamJavaBintang {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Bagian Atas
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
        
        // Bagian Bawah
        for (int i = 4; i >= 1; i--) {
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