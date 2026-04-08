package pekan3_2511532020;

import java.util.ArrayList;
class Siswa {
	String nama;
	int nim;
	
	public Siswa(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim + ", Nama: " + nama;
	}
}
public class SiswaStack_2511532020 {
	private ArrayList<Siswa> stack;
	
	public SiswaStack_2511532020() {
		stack = new ArrayList<>();
	}
	
	public void push_2511532020(Siswa mhs) {
		stack.add(mhs);
	}
	public Siswa pop_2511532020() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa peek_2511532020() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511532020() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511532020 studentStack_2511532020 = new SiswaStack_2511532020();
		
		Siswa mhs1 = new Siswa("Ali", 1);
		Siswa mhs2 = new Siswa("Boby", 2);
		Siswa mhs3 = new Siswa("Charles", 3);
		
		studentStack_2511532020.push_2511532020(mhs1);
		studentStack_2511532020.push_2511532020(mhs2);
		studentStack_2511532020.push_2511532020(mhs3);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_2511532020.tampilkanSiswa_2511532020();
		
		System.out.println("Siswa teratas " + studentStack_2511532020.peek_2511532020());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2511532020.pop_2511532020());
		System.out.println("daftar siswa setelah di pop :");
		studentStack_2511532020.tampilkanSiswa_2511532020();
	}
}
