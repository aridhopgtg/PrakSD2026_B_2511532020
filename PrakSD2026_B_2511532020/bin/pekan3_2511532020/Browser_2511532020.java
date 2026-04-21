package pekan3_2511532020;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511532020 { // Ganti ke 2511532020 jika belum
    public static void main(String[] args) {
        // Menggunakan java.util.Stack dengan tipe data Website [cite: 2, 39]
        Stack<Website_2511532020> riwayat_2020 = new Stack<>();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n= Browser History NIM: 2511532020"); 
            System.out.println("1. Kunjungi Website (Push)"); 
            System.out.println("2. Tombol Back (Pop)"); 
            System.out.println("3. Lihat Halaman Aktif (Peek)"); 
            System.out.println("4. Keluar"); 
            System.out.print("Pilihan: ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    // Operasi Push: Menambah data ke tumpukan [cite: 22]
                    System.out.print("Masukkan Judul: ");
                    String jdl = input.nextLine();
                    System.out.print("Masukkan URL: ");
                    String link = input.nextLine();
                    
                    // Membuat objek Website dan memasukkannya ke Stack
                    riwayat_2020.push(new Website_2511532020(jdl, link)); 
                    System.out.println("Berhasil mengunjungi halaman!"); 
                    break;

                case 2:
                    // Operasi Pop: Menghapus halaman teratas (LIFO) [cite: 4, 23]
                    // Cek kosong agar tidak terjadi EmptyStackException [cite: 26, 42, 43]
                    if (!riwayat_2020.isEmpty()) {
                        Website_2511532020 hapus = riwayat_2020.pop(); 
                        System.out.println("Berhasil menghapus: " + hapus.getJudul_2020()); 
                    } else {
                        System.out.println("Riwayat kosong, tidak ada yang di-Back!"); 
                    }
                    break;

                case 3:
                    // Operasi Peek: Melihat data tanpa menghapus [cite: 6, 24]
                    if (!riwayat_2020.isEmpty()) {
                        Website_2511532020 aktif = riwayat_2020.peek();
                        System.out.println("Halaman Aktif: " + aktif.getJudul_2020());
                        System.out.println("URL: " + aktif.getUrl_2020());
                        System.out.println("Total Riwayat: " + riwayat_2020.size()); 
                    } else {
                        System.out.println("Tidak ada halaman yang sedang dibuka."); 
                    }
                    break;
            }
        } while (menu != 4);
    }
}