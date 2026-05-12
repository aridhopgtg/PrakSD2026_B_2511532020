package pekan6_2511532020;

 public class InsertDLL_2511532020 {
	static NodeDLL_2511532020 insertBegin_2020(NodeDLL_2511532020 head_2020, int data_2020) {
		NodeDLL_2511532020 new_node_2020 = new NodeDLL_2511532020(data_2020);
		new_node_2020.next_2020 = head_2020;
		if (head_2020 != null) {
			head_2020.prev_2020 = new_node_2020;
		}
		return new_node_2020;
		
	}
	
 public static NodeDLL_2511532020 insertEnd_2020(NodeDLL_2511532020 head_2020, int newData_2020) {
	NodeDLL_2511532020 newNode_2020 = new NodeDLL_2511532020(newData_2020);
	if (head_2020 == null) {
		head_2020 = newNode_2020;
	}
	else {
		NodeDLL_2511532020 curr_2020 = head_2020;
		while (curr_2020.next_2020 != null) {
			curr_2020 = curr_2020.next_2020;
		}
		curr_2020.next_2020 = newNode_2020;
		newNode_2020.prev_2020 = curr_2020;
	 }
	return head_2020;
	}

 public static NodeDLL_2511532020 insertAtPosition_2020(NodeDLL_2511532020 head_2020, int pos_2020, int new_data_2020) {
	    NodeDLL_2511532020 new_node_2020 = new NodeDLL_2511532020(new_data_2020);
	    
	    if (pos_2020 == 1) {
	        new_node_2020.next_2020 = head_2020;
	        if (head_2020 != null) {
	            head_2020.prev_2020 = new_node_2020;
	        }
	        head_2020 = new_node_2020;
	        return head_2020;
	    }
	    
	    NodeDLL_2511532020 curr_2020 = head_2020;
	    for (int i = 1; i < pos_2020 - 1 && curr_2020 != null; i++) {
	        curr_2020 = curr_2020.next_2020;
	    }
	    
	    if (curr_2020 == null) {
	        System.out.println("Posisi Tidak Ada");
	        return head_2020;
	    }
	    
	    new_node_2020.prev_2020 = curr_2020;
	    new_node_2020.next_2020 = curr_2020.next_2020;
	    curr_2020.next_2020 = new_node_2020;
	    
	    if (new_node_2020.next_2020 != null) {
	        new_node_2020.next_2020.prev_2020 = new_node_2020;
	    }
	    
	    return head_2020;
	}
 
 public static void printList_2020(NodeDLL_2511532020 head_2020) {
	 NodeDLL_2511532020 curr_2020 = head_2020;
	 while (curr_2020 != null) {
		 System.out.print(curr_2020.data_2020 + " <-> ");
		 curr_2020 = curr_2020.next_2020;
	 }
	 System.out.println();
 }
 
 public static void main(String[] args)  {
	 NodeDLL_2511532020 head_2020 = new NodeDLL_2511532020(2);
	 head_2020.next_2020 = new NodeDLL_2511532020(3);
	 head_2020.next_2020.prev_2020 = head_2020;
	 head_2020.next_2020.next_2020 = new NodeDLL_2511532020(5);
	 head_2020.next_2020.next_2020.prev_2020 = head_2020.next_2020;
	 
	 System.out.print("DLL Awal : ");
	 printList_2020(head_2020);
	 head_2020 = insertBegin_2020(head_2020, 1);
	 System.out.print("simpul 1 ditambah di awal: ");
	 printList_2020(head_2020);
	 System.out.print("simpul 6 ditambah di akhir: ");
	 int data_2020 = 6;
	 head_2020 = insertEnd_2020(head_2020, data_2020);
	 printList_2020(head_2020);
	 System.out.print("tambah node 4 di posisi 4: ");
	 int data2_2020 = 4;
	 int pos_2020 = 4;
	 head_2020 = insertAtPosition_2020(head_2020, pos_2020, data2_2020);
	 printList_2020(head_2020);
 }
}
	 
