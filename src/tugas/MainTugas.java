// Nama: Nur Habsyiah
// NPM: 2410010200
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Menyimpan daftar nama mata kuliah dalam array String (minimal 3, ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Sistem Informasi Geografis", "Cloud Computing"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Poin 3: Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: Menambahkan minimal 5 objek Mahasiswa di awal pengerjaan
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2210010001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2210010002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2210010003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "2210010004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2210010005", 75.0));

        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // Poin 5: Menampilkan rata-rata nilai kelas dan jumlah mahasiswa yang lulus
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // Poin 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("... Menambahkan mahasiswa baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("Fahri", "2210010006", 65.0));
        System.out.println();

        // Poin 6: Menampilkan kembali seluruh data mahasiswa terbaru setelah penambahan data
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Terbaru       : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus Terbaru: " + kelas.jumlahLulus());
    }
}