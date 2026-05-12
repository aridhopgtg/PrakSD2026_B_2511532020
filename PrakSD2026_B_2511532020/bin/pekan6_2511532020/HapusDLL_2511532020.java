package pekan6_2511532020;

public class HapusDLL_2511532020 {
	public static NodeDLL_2511532020 delHead_2020(NodeDLL_2511532020 head_2020) {
		if (head_2020 == null) {
			return null;
		}
		head_2020 = head_2020.next_2020;
		if (head_2020 != null) {
			head_2020.prev_2020 = null;
		}
		return head_2020;
	}
	public static NodeDLL_2511532020 delLast_2020(NodeDLL_2511532020 head_2020) {
		if (head_2020 == null) {
			return null;
		}
		if (head_2020.next_2020 == null) {
			return null;
		}
		NodeDLL_2511532020 curr_2020 = head_2020;
		while (curr_2020.next_2020 != null) {
			curr_2020 = curr_2020.next_2020;
		}
		if (curr_2020.prev_2020 != null) {
			curr_2020.prev_2020.next_2020 = null;
		}
		return head_2020;
	}
	public static NodeDLL_2511532020 delPos_2020(NodeDLL_2511532020 head_2020, int pos_2020) {
		if (head_2020 == null) {
			return head_2020;
		}
		NodeDLL_2511532020 curr_2020 = head_2020;
		for (int i = 1; curr_2020 != null && i < pos_2020; i++) {
			curr_2020 = curr_2020.next_2020;
		}
		if (curr_2020 == null) {
			return head_2020;
		}
		if (curr_2020.prev_2020 != null) {
			curr_2020.prev_2020.next_2020 = curr_2020.next_2020;
		}
		if (curr_2020.next_2020 != null) {
			curr_2020.next_2020.prev_2020 = curr_2020.prev_2020;
		}
		if (head_2020 == curr_2020) {
			head_2020 = curr_2020.next_2020;
		}
		return head_2020;
	}
	public static void printList_2020(NodeDLL_2511532020 head_2020) {
		NodeDLL_2511532020 curr_2020 = head_2020;
		while (curr_2020 != null) {
			System.out.print(curr_2020.data_2020 + " ");
			curr_2020 = curr_2020.next_2020;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeDLL_2511532020 head_2020 = new NodeDLL_2511532020(1);
		head_2020.next_2020 = new NodeDLL_2511532020(2);
		head_2020.next_2020.prev_2020 = head_2020;
		head_2020.next_2020.next_2020 = new NodeDLL_2511532020(3);
		head_2020.next_2020.next_2020.prev_2020 = head_2020.next_2020;
		head_2020.next_2020.next_2020.next_2020 = new NodeDLL_2511532020(4);
		head_2020.next_2020.next_2020.next_2020.prev_2020 = head_2020.next_2020.next_2020;
		head_2020.next_2020.next_2020.next_2020.next_2020 = new NodeDLL_2511532020(5);
		head_2020.next_2020.next_2020.next_2020.next_2020.prev_2020 = head_2020.next_2020.next_2020.next_2020;
		
		System.out.print("DLL Awal: ");
		printList_2020(head_2020);
		
		System.out.print("setelah head dihapus: ");
		head_2020 = delHead_2020(head_2020);
		printList_2020(head_2020);
		
		System.out.print("setelah node terakhir di hapus: ");
		head_2020 = delLast_2020(head_2020);
		printList_2020(head_2020);
		
		System.out.print("menghapus node ke 2: ");
		head_2020 = delPos_2020(head_2020, 2);
		printList_2020(head_2020);
	}

}
