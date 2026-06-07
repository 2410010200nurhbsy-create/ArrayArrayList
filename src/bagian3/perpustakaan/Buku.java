package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku (Enkapsulasi)
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Tambahan dari Latihan Mandiri 3.4 No. 2

    // Constructor: dipanggil saat objek dibuat
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false; // Buku baru dianggap tersedia
        this.tahunTerbit = tahunTerbit;
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }
    
    // Getter untuk tahun terbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku dalam bentuk teks
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}