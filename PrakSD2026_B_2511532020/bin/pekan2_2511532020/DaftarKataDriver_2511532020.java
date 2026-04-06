package pekan2_2511532020;

public class DaftarKataDriver_2511532020 {

	public static void main(String[] args) {
		DaftarKata_2511532020 al = new DaftarKata_2511532020();
		
		al.tambah_2511532020("Kami");
		al.tambah_2511532020("Informatika");
		
		al.tambahPada_2511532020(1, "Mahasiswa");
		
		System.out.println("Awal           : " + al);
		
		al.ubahElemen_2511532020(1, "Departemen");
		System.out.println("Setelah Ubah   : " + al);
		
		String terhapus = al.hapusElemen_2511532020(0);
		System.out.println("Terhapus       : " + terhapus);
		System.out.println("Setelah Hapus  : " + al);
		
		System.out.print("iterasi        : ");
		al.iterasiCetak_2511532020();
		System.out.println();

	}

}
