package bagian2.arraylist;

import java.util.ArrayList; // Wajib di-import untuk menggunakan ArrayList

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        
        // ====================================================================
        // SOAL 1: ArrayList daftar belanja (Tambah 4 item, hapus item ke-2)
        // ====================================================================
        System.out.println("=== SOAL 1: DAFTAR BELANJA ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah 4 item ke daftar belanja
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Gula");    // Ini adalah item ke-2 (indeks 1)
        daftarBelanja.add("Beras");
        daftarBelanja.add("Telur");
        
        // Hapus item ke-2 (karena indeks dimulai dari 0, maka item ke-2 berada di indeks 1)
        daftarBelanja.remove(1); 
        
        // Tampilkan isi list dan jumlah akhirnya
        System.out.println("Isi list     : " + daftarBelanja);
        System.out.println("Jumlah akhir : " + daftarBelanja.size() + " item");
        System.out.println();

        
        // ====================================================================
        // SOAL 2: Mencari nilai terbesar di ArrayList berisi 5 angka
        // ====================================================================
        System.out.println("=== SOAL 2: NILAI TERBESAR ===");
        ArrayList<Integer> nilai = new ArrayList<>(); // Menggunakan wrapper Integer untuk angka
        nilai.add(70); 
        nilai.add(95); 
        nilai.add(60);
        nilai.add(88); 
        nilai.add(75);
        
        // Menelusuri seluruh elemen untuk mencari nilai terbesar
        int max = nilai.get(0); // Ambil elemen pertama sebagai patokan awal
        for (int n : nilai) {
            if (n > max) {
                max = n; // Perbarui nilai max jika ditemukan angka yang lebih besar
            }
        }
        System.out.println("Daftar Angka  : " + nilai);
        System.out.println("Nilai Terbesar: " + max);
        System.out.println();

        
        // ====================================================================
        // SOAL 3: Menambah 6 nama dan mencetak yang diawali huruf 'A'
        // ====================================================================
        System.out.println("=== SOAL 3: NAMA BERAWALAN HURUF A ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambahkan 6 nama ke dalam ArrayList
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ayu");
        daftarNama.add("Citra");
        daftarNama.add("Adit");
        daftarNama.add("Doni");
        
        // Cetak hanya nama yang diawali huruf A menggunakan method startsWith()
        System.out.println("Nama yang diawali huruf 'A':");
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}