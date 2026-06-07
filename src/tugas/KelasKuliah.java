package tugas;

import java.util.ArrayList; // Wajib di-import untuk menampung objek Mahasiswa

public class KelasKuliah {
    // Menyimpan daftar mahasiswa menggunakan ArrayList yang dinamis (sesuai modul)
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambahkan mahasiswa baru ke koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai seluruh kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah total mahasiswa yang dinyatakan lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menampilkan semua data mahasiswa secara terstruktur
    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-12s %-12s %-10s %-12s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-12s %-12s %-10.1f %-12s\n", 
                    mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
}