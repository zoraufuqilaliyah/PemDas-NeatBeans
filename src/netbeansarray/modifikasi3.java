//array 9
package netbeansarray;
import java.util.Scanner;
public class modifikasi3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        String angka = input.nextLine().trim();

        if (!angka.matches("\\d+")) {
            System.out.println("Masukkan angka bulat positif!");
            return;
        }

        StringBuilder hasil = new StringBuilder();
        int jumlah = 0;

        for (int i = angka.length() - 1; i >= 0; i--) {
            hasil.append(angka.charAt(i));
            jumlah++;

            if (jumlah % 3 == 0 && i > 0) {
                hasil.append('.');
            }
        }

        hasil.reverse();

        System.out.println("Hasil: " + hasil);
    }
}
