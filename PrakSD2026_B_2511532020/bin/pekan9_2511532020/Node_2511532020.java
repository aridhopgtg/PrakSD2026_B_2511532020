package pekan9_2511532020;

public class Node_2511532020 {
	int data_2020;
	Node_2511532020 left_2020;
	Node_2511532020 right_2020;
	public Node_2511532020(int data_2020) {
		this.data_2020 = data_2020;
		left_2020 = null;
		right_2020 = null;
	}
	void setLeft_2020(Node_2511532020 node_2020) {
		if (left_2020 == null)
			left_2020 = node_2020;
	}
	public void setRight_2020(Node_2511532020 node_2020) {
		if (right_2020 == null)
			right_2020 = node_2020;
	}
	public Node_2511532020 getLeft_2020() {
		return left_2020;
	}
	public Node_2511532020 getRight_2020() {
		return right_2020;
	}
	public int getData_2020() {
		return data_2020;
	}
	public void setData(int data_2020) {
		this.data_2020 = data_2020;
	}
	
	void printPreorder_2020(Node_2511532020 node_2020) {
		if (node_2020 == null)
			return;
		System.out.print(node_2020.data_2020 + " ");
		printPreorder_2020(node_2020.left_2020);
		printPreorder_2020(node_2020.right_2020);
	}
	void printPostorder_2020(Node_2511532020 node_2020) {
		if (node_2020 == null)
			return;
		printPostorder_2020(node_2020.left_2020);
		printPostorder_2020(node_2020.right_2020);
		System.out.print(node_2020.data_2020 + " ");
	}
	void printInorder_2020(Node_2511532020 node_2020) {
		if (node_2020 == null)
			return;
		printInorder_2020(node_2020.left_2020);
		System.out.print(node_2020.data_2020 + " ");
		printInorder_2020(node_2020.right_2020);
	}
	public String print_2020() {
		return this.print_2020("",true,"");
	}
	public String print_2020(String prefix_2020, boolean isTail_2020, String sb_2020) {
		if (right_2020 != null) {
			right_2020.print_2020(prefix_2020 + (isTail_2020 ? "|    " : "    "), false, sb_2020);
		}
		System.out.println( prefix_2020+(isTail_2020 ? "\\-- " : "/-- ") + data_2020);
		if (left_2020 != null) {
			left_2020.print_2020(prefix_2020 + (isTail_2020 ? "     " : "|    "), true, sb_2020);
		}
		return sb_2020;
	}
}
