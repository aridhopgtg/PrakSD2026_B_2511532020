package pekan5_2511532020;

import java.util.Scanner;

/**
 * Kelas Driver - Mengelola simulasi antrian rumah sakit
 * menggunakan Single Linked List dengan metode FIFO
 */
public class RumahSakit_2511532020 {
    // Head linked list (node pertama)
    private Pasien_2511532020 head_2020;
    // Counter untuk auto-increment nomor antrian
    private int counterAntrian_2020;
    // Scanner untuk input
    private Scanner scanner_2020;

    /**
     * Constructor: Inisialisasi list kosong dan counter mulai dari 0
     */
    public RumahSakit_2511532020() {
        head_2020 = null;
        counterAntrian_2020 = 0;
        scanner_2020 = new Scanner(System.in);
    }

    /**
     * 1. DAFTARKAN PASIEN (Insert at Tail)
     * Menambahkan node baru di akhir linked list.
     * Jika list kosong, node baru menjadi head.
     * Nomor antrian bertambah otomatis (auto-increment).
     */
    public void daftarkanPasien_2020() {
        System.out.print("Masukkan Nama Pasien : ");
        String nama = scanner_2020.nextLine();
        System.out.print("Masukkan Keluhan      : ");
        String keluhan = scanner_2020.nextLine();

        // Auto-increment nomor antrian
        counterAntrian_2020++;
        
        // Membuat node pasien baru
        Pasien_2511532020 pasienBaru = new Pasien_2511532020(nama, keluhan, counterAntrian_2020);

        // KONDISI 1: List kosong, node baru menjadi head
        if (head_2020 == null) {
            head_2020 = pasienBaru;
        } 
        // KONDISI 2: List tidak kosong, traverse ke node terakhir
        else {
            Pasien_2511532020 current = head_2020;
            // Traverse sampai node terakhir (next == null)
            while (current.next_2020 != null) {
                current = current.next_2020;
            }
            // Sambungkan node terakhir ke node baru (Insert at Tail)
            current.next_2020 = pasienBaru;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_2020);
        System.out.println();
    }

    /**
     * 2. PANGGIL PASIEN (Delete Head - FIFO)
     * Menghapus node terdepan dan menampilkan data pasien yang dipanggil.
     * Head digeser ke node berikutnya.
     */
    public void panggilPasien_2020() {
        // Penanganan list kosong (tidak boleh error)
        if (head_2020 == null) {
            System.out.println("== Antrian kosong! Tidak ada pasien yang dapat dipanggil. ==");
            System.out.println();
            return;
        }

        // Simpan data pasien terdepan yang akan dihapus
        Pasien_2511532020 pasienDipanggil = head_2020;
        
        // Geser head ke node berikutnya (Delete Head)
        head_2020 = head_2020.next_2020;

        // Tampilkan informasi pasien yang dipanggil
        System.out.println("== MEMANGGIL PASIEN ==");
        System.out.println("Nomor Antrian : " + pasienDipanggil.getNomorAntrian_2020());
        System.out.println("Nama Pasien   : " + pasienDipanggil.getNama_2020());
        System.out.println("Keluhan       : " + pasienDipanggil.getPenyakit_2020());
        System.out.println("Silakan menuju ruang pemeriksaan!");
        System.out.println();

        // NOTE: Node yang dihapus akan otomatis dibersihkan oleh Garbage Collector
        // karena sudah tidak ada referensi yang menunjuk ke node tersebut
    }

    /**
     * 3. TAMPILKAN ANTRIAN (Display / Traverse)
     * Menelusuri linked list dari head hingga null
     * dan menampilkan semua data pasien beserta posisinya.
     */
    public void tampilkanAntrian_2020() {
        // Penanganan list kosong
        if (head_2020 == null) {
            System.out.println("== Antrian kosong! Tidak ada pasien dalam antrian. ==");
            System.out.println();
            return;
        }

        System.out.println("========== DAFTAR ANTRIAN PASIEN ==========");
        System.out.printf("%-5s %-20s %-25s\n", "No.", "Nama Pasien", "Keluhan");
        System.out.println("---------------------------------------------");

        // Traverse dari head hingga akhir list (null)
        Pasien_2511532020 current = head_2020;
        int posisi = 1;
        while (current != null) {
            System.out.printf("%-5d %-20s %-25s\n", 
                posisi,
                current.getNama_2020(), 
                current.getPenyakit_2020());
            current = current.next_2020; // Pindah ke node berikutnya
            posisi++;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total pasien dalam antrian: " + (posisi - 1));
        System.out.println();
    }

    /**
     * 4. CARI PASIEN (Search - Case Insensitive)
     * Pencarian berdasarkan nama pasien secara linear,
     * tidak membedakan huruf besar/kecil.
     * Menampilkan pesan jika tidak ditemukan.
     */
    public void cariPasien_2020() {
        // Penanganan list kosong
        if (head_2020 == null) {
            System.out.println("== Antrian kosong! Tidak ada pasien yang dapat dicari. ==");
            System.out.println();
            return;
        }

        System.out.print("Masukkan nama pasien yang dicari: ");
        String namaCari = scanner_2020.nextLine();

        // Traverse untuk mencari pasien (Linear Search)
        Pasien_2511532020 current = head_2020;
        boolean ditemukan = false;
        int posisi = 1;

        while (current != null) {
            // Perbandingan case-insensitive (tidak membedakan huruf besar/kecil)
            if (current.getNama_2020().equalsIgnoreCase(namaCari)) {
                System.out.println("== PASIEN DITEMUKAN ==");
                System.out.println("Posisi Antrian ke-" + posisi);
                System.out.println("Nama Pasien   : " + current.getNama_2020());
                System.out.println("Keluhan       : " + current.getPenyakit_2020());
                System.out.println("Nomor Antrian : " + current.getNomorAntrian_2020());
                ditemukan = true;
                break; // Hentikan pencarian jika sudah ditemukan
            }
            current = current.next_2020;
            posisi++;
        }

        if (!ditemukan) {
            System.out.println("Pasien dengan nama \"" + namaCari + "\" tidak ditemukan dalam antrian.");
        }
        System.out.println();
    }

    /**
     * 5. CEK STATUS ANTRIAN
     * Menampilkan jumlah total pasien dan informasi pasien terdepan.
     * Menampilkan pesan khusus jika list kosong.
     */
    public void cekStatusAntrian_2020() {
        // Penanganan list kosong
        if (head_2020 == null) {
            System.out.println("== Status Antrian ==");
            System.out.println("Antrian kosong! Tidak ada pasien yang menunggu.");
            System.out.println();
            return;
        }

        // Hitung total pasien dengan traverse seluruh list
        int total = 0;
        Pasien_2511532020 current = head_2020;
        while (current != null) {
            total++;
            current = current.next_2020;
        }

        System.out.println("== Status Antrian ==");
        System.out.println("Jumlah pasien dalam antrian : " + total);
        System.out.println("--- Pasien Terdepan ---");
        System.out.println("Nama Pasien   : " + head_2020.getNama_2020());
        System.out.println("Keluhan       : " + head_2020.getPenyakit_2020());
        System.out.println("Nomor Antrian : " + head_2020.getNomorAntrian_2020());
        System.out.println();
    }

    /**
     * Menampilkan menu utama program
     */
    public void tampilkanMenu_2020() {
        System.out.println("== Antrian Rumah Sakit NIM: 2511532020 ==");
        System.out.println("1. Daftarkan Pasien (Insert)");
        System.out.println("2. Panggil Pasien (Delete Head)");
        System.out.println("3. Tampilkan Antrian (Display)");
        System.out.println("4. Cari Pasien (Search)");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
        System.out.print("Pilihan: ");
    }

    /**
     * Method untuk menjalankan program utama (loop menu)
     */
    public void jalankan_2020() {
        int pilihan;
        do {
            tampilkanMenu_2020();
            // Validasi input agar hanya menerima angka
            while (!scanner_2020.hasNextInt()) {
                System.out.println("Masukkan pilihan berupa angka!");
                scanner_2020.next(); // Buang input yang salah
                System.out.print("Pilihan: ");
            }
            pilihan = scanner_2020.nextInt();
            scanner_2020.nextLine(); // Membersihkan buffer newline
            System.out.println();

            // Percabangan untuk menjalankan operasi sesuai pilihan
            switch (pilihan) {
                case 1:
                    daftarkanPasien_2020();
                    break;
                case 2:
                    panggilPasien_2020();
                    break;
                case 3:
                    tampilkanAntrian_2020();
                    break;
                case 4:
                    cariPasien_2020();
                    break;
                case 5:
                    cekStatusAntrian_2020();
                    break;
                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                    System.out.println();
            }
        } while (pilihan != 6);

        scanner_2020.close();
    }

    /**
     * Method main - Entry point program
     */
    public static void main(String[] args) {
        RumahSakit_2511532020 rs = new RumahSakit_2511532020();
        rs.jalankan_2020();
    }
}