package pekan6_2511532020;

import java.util.Scanner;

public class Musik_2511532020 {
    // Pointer head dan tail untuk menandai awal dan akhir playlist
    private Lagu_2511532020 head_2020 = null;
    private Lagu_2511532020 tail_2020 = null;

    // 1. Menambah lagu baru di AKHIR playlist
    public void tambahLagu_2020(String judul, String penyanyi) {
        Lagu_2511532020 laguBaru = new Lagu_2511532020(judul, penyanyi);
        
        if (head_2020 == null) {
            // Jika playlist masih kosong
            head_2020 = laguBaru;
            tail_2020 = laguBaru;
        } else {
            // Menghubungkan node baru di akhir (tail)
            tail_2020.next_2020 = laguBaru;
            laguBaru.prev_2020 = tail_2020;
            tail_2020 = laguBaru; // Geser tail ke lagu baru
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Menghapus lagu pertama (head)
    public void hapusLaguAwal_2020() {
        if (head_2020 == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang bisa dihapus.");
            return;
        }
        
        System.out.println("Menghapus lagu: " + head_2020.getJudul_2020() + " - " + head_2020.getPenyanyi_2020());
        
        if (head_2020 == tail_2020) {
            // Jika hanya ada satu lagu di playlist
            head_2020 = null;
            tail_2020 = null;
        } else {
            // Menggeser head ke lagu berikutnya dan memutus hubungan dengan head lama
            head_2020 = head_2020.next_2020;
            head_2020.prev_2020 = null;
        }
    }

    // 3. Menampilkan semua lagu dari awal ke akhir (Maju)
    public void tampilMaju_2020() {
        if (head_2020 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        
        System.out.println("\n=== PLAYLIST (MAJU) ===");
        Lagu_2511532020 current = head_2020;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor + ". " + current.getJudul_2020() + " (" + current.getPenyanyi_2020() + ")");
            current = current.next_2020;
            nomor++;
        }
    }

    // 4. Menampilkan semua lagu dari akhir ke awal (Mundur)
    public void tampilMundur_2020() {
        if (tail_2020 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        
        System.out.println("\n=== PLAYLIST (MUNDUR) ===");
        Lagu_2511532020 current = tail_2020;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor + ". " + current.getJudul_2020() + " (" + current.getPenyanyi_2020() + ")");
            current = current.prev_2020; // Berjalan mundur menggunakan pointer prev
            nomor++;
        }
    }

    // 5. Mencari lagu berdasarkan judul (tidak case-sensitive)
    public void cariLagu_2020(String judul) {
        if (head_2020 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        
        Lagu_2511532020 current = head_2020;
        boolean ditemukan = false;
        
        while (current != null) {
            // Menggunakan equalsIgnoreCase agar pencarian tidak case-sensitive
            if (current.getJudul_2020().equalsIgnoreCase(judul)) {
                System.out.println("Lagu Ditemukan!");
                System.out.println("Judul   : " + current.getJudul_2020());
                System.out.println("Penyanyi: " + current.getPenyanyi_2020());
                ditemukan = true;
                break;
            }
            current = current.next_2020;
        }
        
        if (!ditemukan) {
            System.out.println("Lagu dengan judul '" + judul + "' tidak ditemukan.");
        }
    }

    // Main Method untuk menjalankan menu aplikasi
    public static void main(String[] args) {
        Musik_2511532020 playlist = new Musik_2511532020();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nPlaylist Musik NIM: 2511532020");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = scanner.nextLine();
                    playlist.tambahLagu_2020(judul, penyanyi);
                    break;
                case 2:
                    playlist.hapusLaguAwal_2020();
                    break;
                case 3:
                    playlist.tampilMaju_2020();
                    break;
                case 4:
                    playlist.tampilMundur_2020();
                    break;
                case 5:
                    System.out.print("Masukkan Judul Lagu yang Dicari: ");
                    String cariJudul = scanner.nextLine();
                    playlist.cariLagu_2020(cariJudul);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}