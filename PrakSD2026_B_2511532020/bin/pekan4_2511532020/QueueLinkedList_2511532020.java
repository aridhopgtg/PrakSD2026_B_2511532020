package pekan4_2511532020;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532020 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 6; i++)
			q.add(i);
		System.out.println("Elemen Antrian " + q);
		int hapus = q.remove();
		System.out.println("Hapus elemen = " + hapus);
		System.out.println(q);

		int depan = q.peek();
		System.out.println("Kepala antrian = " + depan);
		
		int banyak = q.size();
		System.out.println("Size Antrian = " + banyak);
	}

}
