package pekan7_2511532020;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AplikasiSorting_2511532020 extends JFrame {
    // Menyimpan data mahasiswa ke dalam ArrayList object
    private ArrayList<Mahasiswa_2511532020> daftarMhs_2020 = new ArrayList<>();

    // Komponen GUI
    private JTextField txtNama_2020, txtNim_2020, txtProdi_2020;
    private JComboBox<String> cmbAlgo_2020;
    private JTextArea areaDaftar_2020, areaLog_2020;
    private JButton btnTambah_2020, btnHapus_2020, btnSort_2020;

    public AplikasiSorting_2511532020() {
        // Pengaturan dasar Frame GUI
        setTitle("Aplikasi Visualisasi Sorting - NIM 2511532020");
        setSize(750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- PANEL INPUT DATA (UTARA) ---
        JPanel panelInput = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput.setBorder(BorderFactory.createTitledBorder("Form Input Mahasiswa"));

        panelInput.add(new JLabel(" Nama Mahasiswa:"));
        txtNama_2020 = new JTextField();
        panelInput.add(txtNama_2020);

        panelInput.add(new JLabel(" NIM Mahasiswa:"));
        txtNim_2020 = new JTextField();
        panelInput.add(txtNim_2020);

        panelInput.add(new JLabel(" Program Studi:"));
        txtProdi_2020 = new JTextField();
        panelInput.add(txtProdi_2020);

        btnTambah_2020 = new JButton("Tambah Data");
        btnHapus_2020 = new JButton("Reset Daftar");
        panelInput.add(btnTambah_2020);
        panelInput.add(btnHapus_2020);

        // --- PANEL AKSI & SORTING (SELATAN) ---
        JPanel panelAksi = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        panelAksi.setBorder(BorderFactory.createTitledBorder("Kontrol Algoritma"));

        panelAksi.add(new JLabel("Pilih Algoritma:"));
        String[] algos = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        cmbAlgo_2020 = new JComboBox<>(algos);
        panelAksi.add(cmbAlgo_2020);

        btnSort_2020 = new JButton("Mulai Sorting");
        panelAksi.add(btnSort_2020);

        // --- PANEL DISPLAY (TENGAH) ---
        JPanel panelDisplay = new JPanel(new GridLayout(1, 2, 10, 10));
        
        areaDaftar_2020 = new JTextArea();
        areaDaftar_2020.setEditable(false);
        JScrollPane scrollDaftar = new JScrollPane(areaDaftar_2020);
        scrollDaftar.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa Saat Ini"));

        areaLog_2020 = new JTextArea();
        areaLog_2020.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(areaLog_2020);
        scrollLog.setBorder(BorderFactory.createTitledBorder("Visualisasi Proses Langkah Sorting"));

        panelDisplay.add(scrollDaftar);
        panelDisplay.add(scrollLog);

        // Menambahkan panel ke Frame Utama
        add(panelInput, BorderLayout.NORTH);
        add(panelDisplay, BorderLayout.CENTER);
        add(panelAksi, BorderLayout.SOUTH);

        // --- LOGIKA EVENT HANDLING (BUTTON ACTIONS) ---

        // Aksi Tambah Data
        btnTambah_2020.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama_2020.getText().trim();
                String nim = txtNim_2020.getText().trim();
                String prodi = txtProdi_2020.getText().trim();

                if (!nama.isEmpty() && !nim.isEmpty() && !prodi.isEmpty()) {
                    daftarMhs_2020.add(new Mahasiswa_2511532020(nama, nim, prodi));
                    perbaruiDaftarUI_2020();
                    // Reset text field
                    txtNama_2020.setText("");
                    txtNim_2020.setText("");
                    txtProdi_2020.setText("");
                    txtNama_2020.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Semua form input wajib diisi!");
                }
            }
        });

        // Aksi Reset Data
        btnHapus_2020.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                daftarMhs_2020.clear();
                perbaruiDaftarUI_2020();
                areaLog_2020.setText("");
            }
        });

        // Aksi Tombol Mulai Sorting
        btnSort_2020.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (daftarMhs_2020.size() < 2) {
                    JOptionPane.showMessageDialog(null, "Tambahkan minimal 2 data mahasiswa untuk disorting!");
                    return;
                }

                int algoTerpilih = cmbAlgo_2020.getSelectedIndex();
                // Membuat salinan sementara agar data awal tetap identik jika ingin mencoba algo lain
                ArrayList<Mahasiswa_2511532020> listSorting = new ArrayList<>(daftarMhs_2020);
                areaLog_2020.setText(""); // Bersihkan log visualisasi sebelumnya

                if (algoTerpilih == 0) {
                    insertionSort_2020(listSorting);
                } else if (algoTerpilih == 1) {
                    selectionSort_2020(listSorting);
                } else if (algoTerpilih == 2) {
                    bubbleSort_2020(listSorting);
                }
            }
        });
    }

    // Memperbarui UI list mahasiswa saat ini
    private void perbaruiDaftarUI_2020() {
        areaDaftar_2020.setText("");
        for (int i = 0; i < daftarMhs_2020.size(); i++) {
            Mahasiswa_2511532020 m = daftarMhs_2020.get(i);
            areaDaftar_2020.append((i + 1) + ". " + m.getNama_2020() + " - " + m.getNim_2020() + " [" + m.getProdi_2020() + "]\n");
        }
    }

    // Helper untuk memformat list menjadi string array visualisasi
    private String dapatkanFormatList_2020(ArrayList<Mahasiswa_2511532020> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getNama_2020());
            if (i < list.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // =========================================================================
    // METHOD SORTING BERDASARKAN ALFABETIS NAMA (COMPARETOIGNORECASE)
    // =========================================================================

    // 1. Logika IMPLEMETASI INSERTION SORT
    public void insertionSort_2020(ArrayList<Mahasiswa_2511532020> list) {
        areaLog_2020.append("=== INSERTION SORT ===\n");
        areaLog_2020.append("Data Awal: " + dapatkanFormatList_2020(list) + "\n\n");
        
        int n = list.size();
        for (int i = 1; i < n; i++) {
            Mahasiswa_2511532020 key = list.get(i);
            int j = i - 1;

            // Menggunakan compareToIgnoreCase untuk pembandingan String A-Z secara Ascending
            while (j >= 0 && list.get(j).getNama_2020().compareToIgnoreCase(key.getNama_2020()) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
            
            // Visualisasi langkah bertahap ke JTextArea dan Console
            String langkah = "Langkah " + i + ": " + dapatkanFormatList_2020(list);
            areaLog_2020.append(langkah + "\n");
            System.out.println(langkah); // Output console sesuai kriteria nilai
        }
        areaLog_2020.append("\nHasil Akhir Berhasil Diurutkan!");
    }

    // 2. Logika IMPLEMENTASI SELECTION SORT
    public void selectionSort_2020(ArrayList<Mahasiswa_2511532020> list) {
        areaLog_2020.append("=== SELECTION SORT ===\n");
        areaLog_2020.append("Data Awal: " + dapatkanFormatList_2020(list) + "\n\n");

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Mencari nilai nama terkecil alfabetnya
                if (list.get(j).getNama_2020().compareToIgnoreCase(list.get(minIdx).getNama_2020()) < 0) {
                    minIdx = j;
                }
            }
            // Swap objek mahasiswa
            Mahasiswa_2511532020 temp = list.get(minIdx);
            list.set(minIdx, list.get(i));
            list.set(i, temp);

            // Visualisasi pass bertahap ke JTextArea dan Console
            String langkah = "Pass " + (i + 1) + ": " + dapatkanFormatList_2020(list);
            areaLog_2020.append(langkah + "\n");
            System.out.println(langkah);
        }
        areaLog_2020.append("\nHasil Akhir Berhasil Diurutkan!");
    }

    // 3. Logika IMPLEMENTASI BUBBLE SORT
    public void bubbleSort_2020(ArrayList<Mahasiswa_2511532020> list) {
        areaLog_2020.append("=== BUBBLE SORT ===\n");
        areaLog_2020.append("Data Awal: " + dapatkanFormatList_2020(list) + "\n\n");

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Bandingkan elemen bersebelahan
                if (list.get(j).getNama_2020().compareToIgnoreCase(list.get(j + 1).getNama_2020()) > 0) {
                    // Swap data
                    Mahasiswa_2511532020 temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
            // Visualisasi pass bertahap ke JTextArea dan Console
            String langkah = "Pass " + (i + 1) + ": " + dapatkanFormatList_2020(list);
            areaLog_2020.append(langkah + "\n");
            System.out.println(langkah);
        }
        areaLog_2020.append("\nHasil Akhir Berhasil Diurutkan!");
    }

    // Main method untuk menjalankan program GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplikasiSorting_2511532020().setVisible(true);
            }
        });
    }
}