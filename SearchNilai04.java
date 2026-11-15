import java.util.Scanner;
import java.util.Arrays;
public class SearchNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for(int i = 0; i < nilai.length; i ++){
            System.out.print("Masukkan nilai ke- " + (i + 1) + ":");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for( int i = 0; i < nilai.length; i ++){
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + "ditemukan pada indeks ke- " + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
            System.out.println("Key yang dicari: " + key);
            System.out.println("Isi array: " + Arrays.toString(nilai));
            System.out.println("Jumlah elemn dicek: " + nilai.length );
        }
    }
}