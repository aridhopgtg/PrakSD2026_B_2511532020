package pekan4_2511532020;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class IterasiQueue_2511532020 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("Praktikum");
		q.add("Struktur");
		q.add("Data");
		q.add("Dan");
		q.add("Algoritma");
		Iterator<String> Iterator = q.iterator();
		while (Iterator.hasNext()) {
			System.out.print(Iterator.next() + " ");
		}
	}

}
