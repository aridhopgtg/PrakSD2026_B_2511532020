package pekan2_2511532020;

	// Kelas ADT Musik dengan akhiran NIM Lengkap [cite: 7, 12]
	class Musik_2511532020 {
	    // Atribut dengan akhiran 4 digit terakhir NIM [cite: 9, 10, 42]
	    private String judul_2020;
	    private String penyanyi_2020;
	    private int durasi_2020;

	    // Constructor untuk inisialisasi atribut [cite: 18]
	    public Musik_2511532020(String judul, String penyanyi, int durasi) {
	        this.judul_2020 = judul;
	        this.penyanyi_2020 = penyanyi;
	        this.durasi_2020 = durasi;
	    }

	    // Selektor (Getter) [cite: 19]
	    public String getJudul_2020() { return judul_2020; }
	    public String getPenyanyi_2020() { return penyanyi_2020; }
	    public int getDurasi_2020() { return durasi_2020; }

	    // Mutator (Setter) [cite: 20]
	    public void setJudul_2020(String judul) { this.judul_2020 = judul; }
	    public void setPenyanyi_2020(String penyanyi) { this.penyanyi_2020 = penyanyi; }
	    public void setDurasi_2020(int durasi) { this.durasi_2020 = durasi; }
	}




