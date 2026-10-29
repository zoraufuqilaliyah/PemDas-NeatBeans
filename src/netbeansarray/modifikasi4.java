//array 10
package netbeansarray;
import java.util.Scanner;
public class modifikasi4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int jumlah = 100000;
        long mulaiString = System.nanoTime();

        String teks1 = "";
        
        for (int i = 1; i <= jumlah; i++) {
            teks1 += i;
        }
        long waktuString =
                System.nanoTime() - mulaiString;
        long mulaiBuilder = System.nanoTime();

        StringBuilder teks2 = new StringBuilder();

        for (int i = 1; i <= jumlah; i++) {
            teks2.append(i);
        }
        long waktuBuilder =
                System.nanoTime() - mulaiBuilder;

        System.out.println("Jumlah angka: " + jumlah);
        System.out.println("Waktu String += : " + waktuString + " nanodetik");
        System.out.println("Waktu StringBuilder.append(): " + waktuBuilder + " nanodetik");

        if (waktuString > waktuBuilder) {
            System.out.println(
                    "StringBuilder lebih cepat pada pengujian ini.");
        } else {
            System.out.println(
                    "String += lebih cepat pada pengujian ini.");
        }
    }
}