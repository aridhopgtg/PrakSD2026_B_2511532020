package pekan4_2511532020;

import java.util.Scanner;

public class AntrianLoket_2511532020 {
    // Variabel wajib sesuai aturan tugas
    int front, rear, max;
    String queue[];

    // Konstruktor untuk inisialisasi
    public AntrianLoket_2511532020(int kapasitas) {
        max = kapasitas;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return rear == max - 1;
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Menambahkan pelanggan ke belakang antrian
    public void enqueue(String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah pelanggan.");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queue[rear] = nama;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Menghapus pelanggan dari depan antrian (FIFO)[cite: 1]
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pelanggan untuk dilayani.");
        } else {
            System.out.println(queue[front] + " telah dilayani");
            front++;
            // Reset jika setelah dihapus menjadi kosong
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    // Menampilkan seluruh isi antrian[cite: 1]
    public void display() {
        if (isEmpty()) {
            System.out.println("Isi antrian: (Kosong)");
        } else {
            System.out.println("Isi antrian:");
            int nomor = 1;
            for (int i = front; i <= rear; i++) {
                System.out.println(nomor + ". " + queue[i]);
                nomor++;
            }
        }
    }

    // Membalik seluruh isi antrian[cite: 1]
    public void Reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dibalik.");
        } else {
            int i = front;
            int j = rear;
            while (i < j) {
                String temp = queue[i];
                queue[i] = queue[j];
                queue[j] = temp;
                i++;
                j--;
            }
            System.out.println("Antrian berhasil dibalik.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inisialisasi kapasitas antrian, misal 10
        AntrianLoket_2511532020 loket = new AntrianLoket_2511532020(10);
        int pilihan;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    loket.enqueue(nama);
                    break;
                case 2:
                    loket.dequeue();
                    break;
                case 3:
                    loket.display();
                    break;
                case 4:
                    loket.Reverse();
                    loket.display();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}
