import java.util.Scanner;
public class ArrayNilai04 {

    public static void main(String[] args) {
        
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i ++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ":");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i ++){
            if (nilaiAkhir[i] > 70) {
            System.out.print("Mahasisawa ke-" + (i + 1) + ":" + nilaiAkhir[i] + "(LULUS)");
            }
        }
    }
}