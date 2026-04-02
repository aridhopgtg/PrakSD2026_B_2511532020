package pekan1_2511532020;

public class MobilDriver_2511532020 {
    public static void main(String[] args) {
        System.out.println("=== Program ADT Mobil - NIM 2511532020 ===");

        // 1. Tambah Mobil (Membuat Objek Baru)
        Mobil_2511532020 mobil1 = new Mobil_2511532020("Avanza", 2020, 1300, 150000000, "Toyota");
        
        // 2. Menampilkan Data (Menggunakan Selektor)
        System.out.println("\nData Mobil Saat Ini:");
        System.out.println(mobil1.toString());

        // 3. Mengubah Data (Menggunakan Mutator)
        System.out.println("\n--- Mengubah Harga dan Tahun Mobil ---");
        mobil1.setHarga(160000000);
        mobil1.setTahun(2021);
        
        System.out.println("Data setelah update: " + mobil1.getNama() + " (" + mobil1.getTahun() + ")");
        System.out.println("Harga terbaru: Rp" + mobil1.getHarga());

        // 4. Hapus Mobil
        System.out.println("\n--- Menghapus Data Mobil ---");
        mobil1.hapusMobil();
        System.out.println("Status data sekarang: " + mobil1.toString());
    }
}