import java.util.Scanner;

class Barang {
    private int[] kodeBarang;
    private String[] namaBarang;
    private String[] lokasi;
    private int[] stok;
    private int count;

    public Barang() {
        kodeBarang = new int[100];
        namaBarang = new String[100];
        lokasi = new String[100];
        stok = new int[100];
        count = 0;
    }

    public void tambahBarangBaru() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode barang: ");
        kodeBarang[count] = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan nama barang: ");
        namaBarang[count] = scanner.nextLine();
        System.out.print("Masukkan lokasi barang: ");
        lokasi[count] = scanner.nextLine();
        System.out.print("Masukkan stok barang: ");
        stok[count] = scanner.nextInt();
        count++;
    }

    public void inputBarangMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode barang yang masuk: ");
        int kode = scanner.nextInt();
        System.out.print("Masukkan jumlah barang masuk: ");
        int jumlahMasuk = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (kodeBarang[i] == kode) {
                stok[i] += jumlahMasuk;
                System.out.println("Barang berhasil ditambahkan ke stok.");
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    public void inputBarangKeluar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode barang yang keluar: ");
        int kode = scanner.nextInt();
        System.out.print("Masukkan jumlah barang keluar: ");
        int jumlahKeluar = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (kodeBarang[i] == kode) {
                if (stok[i] >= jumlahKeluar) {
                    stok[i] -= jumlahKeluar;
                    System.out.println("Barang berhasil dikurangi dari stok.");
                } else {
                    System.out.println("Stok barang tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }



    public void displayBarang() {
        System.out.println("===================================================================");
        System.out.printf("%-10s %-20s %-20s %-10s%n", "Kode", "Nama Barang", "Lokasi", "Stok");
        System.out.println("===================================================================");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-10s %-20s %-20s %-10s%n", kodeBarang[i], namaBarang[i], lokasi[i], stok[i]);
        }
        System.out.println("===================================================================");
    }
}