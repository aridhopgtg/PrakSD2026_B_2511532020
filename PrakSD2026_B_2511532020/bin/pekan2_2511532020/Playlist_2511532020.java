package pekan2_2511532020;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532020 {
    public static void main(String[] args) {
        // Implementasi ArrayList untuk mengelola objek secara dinamis [cite: 4, 40]
        ArrayList<Musik_2511532020> listLagu = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilan menu sesuai contoh output [cite: 27, 28]
            System.out.println("\n= Playlist Musik NIM: 2511532020");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Fitur Tambah Lagu [cite: 22, 29]
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();
                    
                    listLagu.add(new Musik_2511532020(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan! [cite: 37]");
                    break;

                case 2:
                    // Fitur Lihat Playlist dengan perulangan [cite: 23, 30]
                    System.out.println("\n--- Daftar Playlist ---");
                    if (listLagu.isEmpty()) {
                        System.out.println("Playlist masih kosong.");
                    } else {
                        for (int i = 0; i < listLagu.size(); i++) {
                            Musik_2511532020 m = listLagu.get(i);
                            System.out.println(i + ". " + m.getJudul_2020() + " - " + 
                                               m.getPenyanyi_2020() + " (" + m.getDurasi_2020() + "s)");
                        }
                        // Cek Kapasitas menggunakan .size() [cite: 26]
                        System.out.println("Total lagu saat ini: " + listLagu.size());
                    }
                    break;

                case 3:
                    // Fitur Hapus Lagu berdasarkan indeks [cite: 25, 31]
                    if (listLagu.isEmpty()) {
                        System.out.println("Tidak ada lagu untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor indeks lagu yang akan dihapus: ");
                        int indeks = input.nextInt();
                        if (indeks >= 0 && indeks < listLagu.size()) {
                            listLagu.remove(indeks);
                            System.out.println("Lagu berhasil dihapus.");
                        } else {
                            System.out.println("Indeks tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 4);

        input.close();
    }

}


