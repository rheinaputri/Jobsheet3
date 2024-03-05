import java.util.Scanner;
public class GudangMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan jumlah data barang: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // untuk membersihkan newline

        Gudang[] gudang = new Gudang[jumlahData];

        // Mengisi array of objects Gudang
        for (int i = 0; i < jumlahData; i++) {
            System.out.println();
            System.out.println("Data Barang ke-" + (i+1));
            System.out.print("Kode Barang\t: ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Nama Barang\t: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Jumlah Barang\t: ");
            int jumlahBarang = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            gudang[i] = new Gudang(kodeBarang, namaBarang, jumlahBarang);
        }

        // Menampilkan semua data barang
        tampilkanDataBarang(gudang);

        // Mencari data barang
        System.out.print("\nMasukkan kode barang yang ingin dicari: ");
        String cariKode = scanner.nextLine();
        cariDataBarang(gudang, cariKode);

        scanner.close();
    }

    public static void tampilkanDataBarang(Gudang[] gudang) {
        System.out.println("\n*********** Daftar Data Barang ***********");
        for (Gudang barang : gudang) {
            System.out.println("Kode Barang\t: " + barang.getKodeBarang());
            System.out.println("Nama Barang\t: " + barang.getNamaBarang());
            System.out.println("Jumlah Barang\t: " + barang.getJumlahBarang());
            System.out.println();
        }
    }

    public static void cariDataBarang(Gudang[] gudang, String kodeCari) {
        boolean found = false;
        System.out.println("\n*********** Hasil Pencarian: ***********");
        for (Gudang barang : gudang) {
            if (barang.getKodeBarang().equalsIgnoreCase(kodeCari)) {
                System.out.println("Kode Barang\t: " + barang.getKodeBarang());
                System.out.println("Nama Barang\t: " + barang.getNamaBarang());
                System.out.println("Jumlah Barang\t: " + barang.getJumlahBarang());
                found = true;
                break; // keluar dari loop jika sudah ditemukan
            }
        }
        if (!found) {
            System.out.println("Data barang dengan kode " + kodeCari + " tidak ditemukan.");
        }
    }
}