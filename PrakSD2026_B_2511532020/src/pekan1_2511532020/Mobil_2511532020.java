package pekan1_2511532020;

public class Mobil_2511532020 {
    // Atribut (Private sesuai prinsip Enkapsulasi ADT)
    private String nama;
    private int tahun;
    private int cc;
    private long harga; // Menggunakan long karena harga mobil biasanya besar
    private String merk;

    // --- Constructor (Representasi dari "Tambah Mobil") ---
    public Mobil_2511532020(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // --- Selektor (Getters) ---
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public long getHarga() { return harga; }
    public String getMerk() { return merk; }

    // --- Mutator (Setters) ---
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(long harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // --- Method Hapus Mobil ---
    // Dalam konteks ADT sederhana, menghapus berarti mengosongkan nilai atribut objek
    public void hapusMobil() {
        this.nama = "-";
        this.tahun = 0;
        this.cc = 0;
        this.harga = 0;
        this.merk = "-";
        System.out.println("Data mobil telah dihapus/direset.");
    }

    // Method pembantu untuk menampilkan data
    @Override
    public String toString() {
        return String.format("Mobil [Merk: %s, Nama: %s, Tahun: %d, CC: %d, Harga: Rp%,d]", 
                              merk, nama, tahun, cc, harga);
    }
}