package pekan6_2511532020;

public class PenelusuranDLL_2511532020 {
	static void forwardTraversal_2020(NodeDLL_2511532020 head_2020) {
		NodeDLL_2511532020 curr_2020 = head_2020;
		while (curr_2020 != null) {
			System.out.print(curr_2020.data_2020 + " <-> ");
			curr_2020 = curr_2020.next_2020;
		}
		System.out.println();
	}
	static void backwardTraversal_2020(NodeDLL_2511532020 tail_2020) {
		NodeDLL_2511532020 curr_2020 = tail_2020;
		while (curr_2020 != null) {
			System.out.print(curr_2020.data_2020 + " <-> ");
			curr_2020 = curr_2020.prev_2020;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeDLL_2511532020 head_2020 = new NodeDLL_2511532020(1);
		NodeDLL_2511532020 second_2020 = new NodeDLL_2511532020(2);
		NodeDLL_2511532020 third_2020 = new NodeDLL_2511532020(3);
		
		head_2020.next_2020 = second_2020;
		second_2020.prev_2020 = head_2020;
		second_2020.next_2020 = third_2020;
		third_2020.prev_2020 = second_2020;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2020(head_2020);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2020(third_2020);
	}
}
