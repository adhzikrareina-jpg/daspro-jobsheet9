import java.util.Scanner;
public class TugasPengelolaanNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Jumlah harus minimal 1.");
            }
        } while (n < 1);
 
        int[]  nilai = new int[n];
        int total = 0;
        for(int i = 0; i < nilai.length; i ++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ":");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        } 
        double rataRata = (double) total / nilai.length;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for(int i = 1; i < nilai.length; i ++){
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        for(int i = 0; i < nilai.length; i ++){
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke- " + (i + 1) + ":" + nilai[i] + "(" + status + ")");
        }
        System.out.println("Rata rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}