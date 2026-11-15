import java.util.Scanner;
public class ArrayRataNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        int total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i ++ ){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ":");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rataRata = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata rata: " + rataRata);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs [0];
        for(int i = 0; i < nilaiMhs.length; i ++){
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String predikat;
        if (rataRata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rataRata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.print("Predikat kelas: " + predikat);
    }
}