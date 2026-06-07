package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        
        // ====================================================================
        // SOAL 1: Array berisi 6 suhu harian (double). Mencari tertinggi & terendah.
        // ====================================================================
        System.out.println("=== SOAL 1: SUHU HARIAN ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4}; // [cite: 343]
        
        double max = suhu[0]; 
        double min = suhu[0]; 
        
        for (double s : suhu) { 
            if (s > max) { 
                max = s; 
            }
            if (s < min) { 
                min = s; 
            }
        }
        System.out.println("Suhu Tertinggi: " + max + "°C"); // [cite: 349]
        System.out.println("Suhu Terendah : " + min + "°C"); // [cite: 350]
        System.out.println();

        
        // ====================================================================
        // SOAL 2: Array String berisi 5 nama hari. Cetak yang > 5 huruf.
        // ====================================================================
        System.out.println("=== SOAL 2: NAMA HARI (> 5 HURUF) ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        for (String h : hari) {
            // Menggunakan .length() untuk menghitung jumlah huruf pada String
            if (h.length() > 5) {
                System.out.println("Hari: " + h + " (" + h.length() + " huruf)");
            }
        }
        System.out.println();

        
        // ====================================================================
        // SOAL 3: Menghitung banyak angka genap dari array yang ditentukan.
        // ====================================================================
        System.out.println("=== SOAL 3: HITUNG BILANGAN GENAP ===");
        int[] angka = {4, 8, 15, 16, 23, 42}; // [cite: 352]
        int genap = 0; // [cite: 353]
        
        for (int a : angka) { // [cite: 354]
            if (a % 2 == 0) { // Jika habis dibagi 2, berarti genap [cite: 356]
                genap++; // [cite: 356]
            }
        }
        System.out.println("Banyaknya angka genap: " + genap); // Hasilnya harusnya 4 
    }
}