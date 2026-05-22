package pekan6_2511532020;

//Kelas Node untuk merepresentasikan satu lagu
public class Lagu_2511532020 {
 // Atribut wajib menggunakan akhiran 4 digit NIM
 private String judul_2020;
 private String penyanyi_2020;
 
 // Pointer next dan prev wajib pakai akhiran NIM
 public Lagu_2511532020 next_2020;
 public Lagu_2511532020 prev_2020;

 // Constructor untuk inisialisasi lagu baru
 public Lagu_2511532020(String judul, String penyanyi) {
     this.judul_2020 = judul;
     this.penyanyi_2020 = penyanyi;
     this.next_2020 = null;
     this.prev_2020 = null;
 }

 // Getter dan Setter untuk judul
 public String getJudul_2020() {
     return judul_2020;
 }

 public void setJudul_2020(String judul_2020) {
     this.judul_2020 = judul_2020;
 }

 // Getter dan Setter untuk penyanyi
 public String getPenyanyi_2020() {
     return penyanyi_2020;
 }

 public void setPenyanyi_2020(String penyanyi_2020) {
     this.penyanyi_2020 = penyanyi_2020;
 }
}