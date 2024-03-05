import java.util.Scanner;
public class BarangMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barang barang = new Barang();
        boolean running = true;

        while (running) {
            System.out.println("=== Aplikasi Manajemen Barang ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Input Barang Masuk");
            System.out.println("3. Input Barang Keluar");
            System.out.println("4. Tampilkan Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    barang.tambahBarangBaru();
                    break;
                case 2:
                    barang.inputBarangMasuk();
                    break;
                case 3:
                    barang.inputBarangKeluar();
                    break;
                case 4:
                    barang.displayBarang();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }

        scanner.close();
    }
}