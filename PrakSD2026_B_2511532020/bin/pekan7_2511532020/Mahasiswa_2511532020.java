package pekan7_2511532020;

//Kelas ADT Mahasiswa untuk menyimpan data komponen mahasiswa
public class Mahasiswa_2511532020 {
 private String nama_2020;
 private String nim_2020;
 private String prodi_2020;

 // Constructor
 public Mahasiswa_2511532020(String nama, String nim, String prodi) {
     this.nama_2020 = nama;
     this.nim_2020 = nim;
     this.prodi_2020 = prodi;
 }

 // Getter dan Setter
 public String getNama_2020() {
     return nama_2020;
 }

 public void setNama_2020(String nama_2020) {
     this.nama_2020 = nama_2020;
 }

 public String getNim_2020() {
     return nim_2020;
 }

 public void setNim_2020(String nim_2020) {
     this.nim_2020 = nim_2020;
 }

 public String getProdi_2020() {
     return prodi_2020;
 }

 public void setProdi_2020(String prodi_2020) {
     this.prodi_2020 = prodi_2020;
 }

 // Mengembalikan string format untuk ditampilkan di daftar/proses
 @Override
 public String toString() {
     return nama_2020 + " (" + nim_2020 + ")";
 }
}