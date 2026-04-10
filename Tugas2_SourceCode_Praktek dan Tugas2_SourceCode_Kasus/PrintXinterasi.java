//Nama  : Muhammad Riswan
//NIM   : 13020240086
//Kelas : A3
import java.util.Scanner;

/* contoh baca nilai x */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); // First element

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            sum = x; // inisialisasi

            for (;;) {
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt(); // next element

                if (x == 999) {
                    break;
                } else {
                    sum = sum + x;
                }
            }
        }

        System.out.println("Hasil penjumlahan = " + sum);

        masukan.close();
    }
}