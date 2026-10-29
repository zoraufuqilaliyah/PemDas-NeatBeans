//array 8
package netbeansarray;
import java.util.Scanner;
public class modifikasi2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            if (!Character.isWhitespace(kalimat.charAt(i))) {
                hasil.append(kalimat.charAt(i));
            }
        }

        System.out.println("Hasil tanpa spasi: " + hasil);
    }
}
