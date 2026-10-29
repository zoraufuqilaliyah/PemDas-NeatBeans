package netbeansarray;  
import java.util.Scanner;
import java.util.Arrays;
public class ArrayNew {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU LATIHAN JAVA =====");
            System.out.println("1. Rata-rata nilai mahasiswa");
            System.out.println("2. Transpose matriks 3x3");
            System.out.println("3. Nilai terbesar dan posisinya");
            System.out.println("4. Jumlah diagonal utama matriks");
            System.out.println("5. Pendataan mahasiswa 3 dimensi");
            System.out.println("6. Menghitung jumlah kata");
            System.out.println("7. Mengubah huruf pertama menjadi kapital");
            System.out.println("8. Memeriksa anagram");
            System.out.println("9. Menghapus spasi dengan StringBuilder");
            System.out.println("10. Pemisah ribuan");
            System.out.println("11. Perbandingan String dan StringBuilder");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    rataRataMahasiswa();
                    break;
                case 2:
                    transposeMatriks();
                    break;
                case 3:
                    nilaiTerbesar();
                    break;
                case 4:
                    diagonalUtama();
                    break;
                case 5:
                    dataMahasiswa();
                    break;
                case 6:
                    hitungKata();
                    break;
                case 7:
                    hurufKapital();
                    break;
                case 8:
                    cekAnagram();
                    break;
                case 9:
                    hapusSpasi();
                    break;
                case 10:
                    pemisahRibuan();
                    break;
                case 11:
                    bandingkanWaktu();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }

    // 1. Rata-rata nilai 3 mahasiswa untuk 4 mata kuliah
    static void rataRataMahasiswa() {
        double[][] nilai = new double[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Nilai mata kuliah "
                        + (j + 1) + ": ");
                nilai[i][j] = Double.parseDouble(input.nextLine());
            }
        }

        for (int i = 0; i < 3; i++) {
            double total = 0;

            for (int j = 0; j < 4; j++) {
                total += nilai[i][j];
            }

            System.out.println("Rata-rata mahasiswa "
                    + (i + 1) + " = " + total / 4);
        }
    }

    // 2. Transpose matriks 3x3
    static void transposeMatriks() {
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1)
                        + ", kolom " + (j + 1) + ": ");
                matriks[i][j] =
                        Integer.parseInt(input.nextLine());
            }
        }

        System.out.println("Hasil transpose:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[j][i] + "\t");
            }
            System.out.println();
        }
    }

    // 3. Mencari nilai terbesar dan posisi baris serta kolom
    static void nilaiTerbesar() {
        int[][] matriks = bacaMatriks();

        int terbesar = matriks[0][0];
        int baris = 0;
        int kolom = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriks[i][j] > terbesar) {
                    terbesar = matriks[i][j];
                    baris = i;
                    kolom = j;
                }
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Posisi baris: " + (baris + 1));
        System.out.println("Posisi kolom: " + (kolom + 1));
    }

    // Membaca matriks 3x3
    static int[][] bacaMatriks() {
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1)
                        + ", kolom " + (j + 1) + ": ");
                matriks[i][j] =
                        Integer.parseInt(input.nextLine());
            }
        }

        return matriks;
    }

    // 4. Menjumlahkan diagonal utama matriks
    static void diagonalUtama() {
        int[][] matriks = bacaMatriks();
        int jumlah = 0;

        System.out.println("Diagonal utama:");

        for (int i = 0; i < 3; i++) {
            System.out.println(matriks[i][i]);
            jumlah += matriks[i][i];
        }

        System.out.println("Jumlah diagonal utama: " + jumlah);
    }

    // 5. Pendataan mahasiswa berdasarkan prodi, kelas, nama
    static void dataMahasiswa() {
        String[][][] arr = new String[3][3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nProgram Studi " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.println("Kelas " + (j + 1));

                for (int k = 0; k < 5; k++) {
                    System.out.print("Nama mahasiswa ke-"
                            + (k + 1) + ": ");
                    arr[i][j][k] = input.nextLine();
                }
            }
        }

        System.out.println("\n===== DATA MAHASISWA =====");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nProgram Studi " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.println("Kelas " + (j + 1));

                for (int k = 0; k < 5; k++) {
                    System.out.println((k + 1) + ". "
                            + arr[i][j][k]);
                }
            }
        }
    }

    // 6. Menghitung jumlah kata menggunakan split
    static void hitungKata() {
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine().trim();

        int jumlah = kalimat.isEmpty()
                ? 0 : kalimat.split("\\s+").length;

        System.out.println("Jumlah kata: " + jumlah);
    }

    // 7. Mengubah huruf pertama setiap kata menjadi kapital
    static void hurufKapital() {
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine().toLowerCase();

        String[] kata = kalimat.split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (!k.isEmpty()) {
                if (hasil.length() > 0) {
                    hasil.append(" ");
                }

                hasil.append(k.substring(0, 1).toUpperCase());
                hasil.append(k.substring(1));
            }
        }

        System.out.println("Hasil: " + hasil);
    }

    // 8. Memeriksa anagram
    static void cekAnagram() {
        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine()
                .replaceAll("\\s+", "").toLowerCase();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = input.nextLine()
                .replaceAll("\\s+", "").toLowerCase();

        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata merupakan anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }
    }

    // 9. Menghapus semua spasi menggunakan StringBuilder
    static void hapusSpasi() {
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

    // 10. Menyisipkan titik sebagai pemisah ribuan
    static void pemisahRibuan() {
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

    // 11. Membandingkan waktu String += dan StringBuilder
    static void bandingkanWaktu() {
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
        System.out.println("Waktu String += : "
                + waktuString + " nanodetik");
        System.out.println("Waktu StringBuilder.append(): "
                + waktuBuilder + " nanodetik");

        if (waktuString > waktuBuilder) {
            System.out.println(
                    "StringBuilder lebih cepat pada pengujian ini.");
        } else {
            System.out.println(
                    "String += lebih cepat pada pengujian ini.");
        }
    }
}    