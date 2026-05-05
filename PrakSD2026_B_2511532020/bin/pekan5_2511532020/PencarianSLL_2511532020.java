package pekan5_2511532020;

public class PencarianSLL_2511532020 {
	static boolean searchKey_2020(NodeSLL_2020 head_2020, int key_2020) {
		NodeSLL_2020 curr_2020 = head_2020;
		while (curr_2020 != null) {
			if (curr_2020.data == key_2020)
				return true;
			curr_2020 = curr_2020.next;
		}
		return false;
	}
	public static void traversal_2020(NodeSLL_2020 head_2020) {
		NodeSLL_2020 curr_2020 = head_2020;
		while (curr_2020 != null) {
			System.out.print(" " + curr_2020.data);
			curr_2020 = curr_2020.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeSLL_2020 head_2020 = new NodeSLL_2020(14);
		head_2020.next = new NodeSLL_2020(21);
		head_2020.next.next = new NodeSLL_2020(13);
		head_2020.next.next.next = new NodeSLL_2020(30);
		head_2020.next.next.next.next = new NodeSLL_2020(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2020(head_2020);
		int key_2020 = 30;
		System.out.print("cari data " + key_2020 + " = ");
		if (searchKey_2020(head_2020, key_2020))
			System.out.println("Ketemu");
		else
			System.out.println("tidak ada");
	}

}
