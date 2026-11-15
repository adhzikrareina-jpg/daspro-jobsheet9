import java.util.Scanner;
public class TugasAplikasiPemesanan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("DAFTAR MENU KAFE KAMPUS");
        for(int i = 0; i < menu.length; i ++){
            System.out.println((i + 1) + "." + menu[i] + "- Rp" + harga[i]);
        }
        String cariLagi;
        do{
            System.out.println("Cari menu (ketik): ");
            String cari = sc.nextLine().trim();

            boolean ditemukan = false;
            for(int i = 0; i < menu.length; i ++){
                if (menu[i].equalsIgnoreCase(cari)) {
                    System.out.println(menu[i] + "tersedia harga: Rp " + harga[i]);
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Menu  \""+ cari + "\"tidak tersedia.");
            }
            System.out.println("Cari menu lagi? (y/t): ");
            cariLagi = sc.nextLine().trim();
        } while (cariLagi.equalsIgnoreCase("y"));

        int jumlah;
        do{
            System.out.println("Masukkan jumlah item yang dipesan: ");
            jumlah = sc.nextInt();
            if (jumlah < 1) {
                System.out.println("Jumlah minimal 1.");
            }
        } while (jumlah < 1);
        String[] pesanan = new String [jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for(int i = 0; i < jumlah; i ++){
            int idx = -1;
            while (idx == -1) {
                System.out.println("Pesanan ke- " + (i + 1) + ":");
                String nama = sc.nextLine().trim();
                for(int j = 0; j < menu.length; j ++){
                    if ((menu[j]).equalsIgnoreCase(nama)) {
                        idx = j;
                        break;
                    }
                }
                if (idx == -1) {
                    System.out.println("Menu tidak tersedia, silahkan coba lagi.");
                }
            }
            pesanan[i] = menu [idx];
            hargaPesanan[i] = harga[idx];
            total += harga[idx];
        }
        System.out.println("DAFTAR PESANAN");
        for(int i = 0; i < pesanan.length; i ++){
            System.out.println((i + 1) + "." + pesanan[i] + " -Rp " + hargaPesanan[i]);
        }
        System.out.println("TOTAL BIAYA : Rp " + total);
    }
}