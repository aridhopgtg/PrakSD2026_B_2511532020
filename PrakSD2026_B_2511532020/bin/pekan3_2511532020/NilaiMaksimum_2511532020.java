package pekan3_2511532020;

import java.util.Stack;

public class NilaiMaksimum_2511532020 {
	public static int max(Stack<Integer> s) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue_2511532020 = s.pop();
		backup.push(maxValue_2511532020);
		while (!s.isEmpty()) {
			int next_2511532020 = s.pop();
			backup.push(next_2511532020);
			maxValue_2511532020 = Math.max(maxValue_2511532020, next_2511532020);
		}
		while (!backup.isEmpty()) {
			s.push(backup.pop());
		}
		return maxValue_2511532020;
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(70);
		s.push(12);
		s.push(20);
		System.out.println("isi stack: " + s);
		System.out.println("Stack teratas: " + s.peek());
		System.out.println("Nilai Maksimum: " + max(s));
	}

}
