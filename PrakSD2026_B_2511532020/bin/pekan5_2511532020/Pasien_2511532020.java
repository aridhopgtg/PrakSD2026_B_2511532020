package pekan5_2511532020;

/**
 * Kelas ADT Pasien - Mewakili satu node dalam Single Linked List
 * Setiap node menyimpan data pasien dan referensi ke node berikutnya
 */
public class Pasien_2511532020 {
    // Atribut dengan akhiran 4 digit NIM
    private String namaPasien_2020;
    private String penyakit_2020;
    private int nomorAntrian_2020;
    
    // Pointer ke node berikutnya (wajib akhiran NIM)
    Pasien_2511532020 next_2020;

    /**
     * Constructor: Menginisialisasi semua atribut node pasien
     * @param nama     Nama pasien
     * @param penyakit Keluhan/penyakit pasien
     * @param nomor    Nomor antrian pasien
     */
    public Pasien_2511532020(String nama, String penyakit, int nomor) {
        this.namaPasien_2020 = nama;
        this.penyakit_2020 = penyakit;
        this.nomorAntrian_2020 = nomor;
        this.next_2020 = null; // Awalnya tidak menunjuk ke node manapun
    }

    // ========== SELEKTOR (GETTER) ==========
    public String getNama_2020() {
        return namaPasien_2020;
    }

    public String getPenyakit_2020() {
        return penyakit_2020;
    }

    public int getNomorAntrian_2020() {
        return nomorAntrian_2020;
    }
}