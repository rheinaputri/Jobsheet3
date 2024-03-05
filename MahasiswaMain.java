import java.util.ArrayList;
import java.util.Scanner;
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.println();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after nextInt()

        // Loop untuk mengisi informasi mahasiswa
        System.out.println();
        System.out.println("***************** MASUKKAN DATA MAHASISWA *****************");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println();
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Nama\t: ");
            String nama = scanner.nextLine();
            System.out.print("NIM\t: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis Kelamin (L/P)\t: ");
            char jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("IPK\t: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character after nextDouble()

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            daftarMahasiswa.add(mahasiswa);
        }

        System.out.println();
        System.out.println("***************** DATA MAHASISWA *****************");
        // Looping untuk mencetak informasi mahasiswa
        int count = 1;
        for ( Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("\nData Mahasiswa ke-" + (count++));
            System.out.println("Nama\t: " + mahasiswa.getNama());
            System.out.println("NIM\t: " + mahasiswa.getNim());
            System.out.println("Jenis Kelamin\t: " + mahasiswa.getJenisKelamin());
            System.out.println("IPK\t: " + mahasiswa.getIpk());
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }

        double rataRataIpk = totalIpk / jumlahMahasiswa;
        System.out.println("Rata-rata IPK: " + rataRataIpk);
        scanner.close();
    }
}