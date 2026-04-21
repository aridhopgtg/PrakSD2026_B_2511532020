package pekan3_2511532020;

public class Website_2511532020 {
    // Atribut wajib menggunakan akhiran 4 digit NIM [cite: 10, 14]
    private String judul_2020; 
    private String url_2020; 

    // Constructor untuk inisialisasi data [cite: 18]
    public Website_2511532020(String judul, String url) {
        this.judul_2020 = judul;
        this.url_2020 = url;
    }

    // Selektor (Getter) - Ini yang akan dipanggil oleh kelas Browser [cite: 19]
    public String getJudul_2020() {
        return judul_2020;
    }

    public String getUrl_2020() {
        return url_2020;
    }

    // Mutator (Setter) [cite: 20]
    public void setJudul_2020(String judul) {
        this.judul_2020 = judul;
    }

    public void setUrl_2020(String url) {
        this.url_2020 = url;
    }
}