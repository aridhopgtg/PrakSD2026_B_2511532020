package pekan5_2511532020;

public class TambahSLL_2511532020 {
    
    public static NodeSLL_2020 insertAtFront(NodeSLL_2020 head_2020, int value_2020) {
        NodeSLL_2020 new_node_2020 = new NodeSLL_2020(value_2020);
        new_node_2020.next = head_2020;
        return new_node_2020;
    }

    public static NodeSLL_2020 insertAtEnd(NodeSLL_2020 head_2020, int value_2020) {
        NodeSLL_2020 newNode_2020 = new NodeSLL_2020(value_2020);
        if (head_2020 == null) {
            return newNode_2020;
        }
        NodeSLL_2020 last_2020 = head_2020;
        while (last_2020.next != null) {
            last_2020 = last_2020.next;
        }
        last_2020.next = newNode_2020;
        return head_2020;
    }

    static NodeSLL_2020 GetNode(int data_2020) {
        return new NodeSLL_2020(data_2020);
    }

    static NodeSLL_2020 insertPos(NodeSLL_2020 headNode_2020, int position_2020, int value_2020) {
        if (position_2020 < 1) {
            System.out.println("Invalid Position");
            return headNode_2020;
        }

        // Jika tambah di posisi pertama (head)
        if (position_2020 == 1) {
            NodeSLL_2020 newNode_2020 = new NodeSLL_2020(value_2020);
            newNode_2020.next = headNode_2020;
            return newNode_2020;
        }

        NodeSLL_2020 temp_2020 = headNode_2020;
        // Iterasi sampai posisi sebelum lokasi penyisipan
        for (int i = 1; i < position_2020 - 1 && temp_2020 != null; i++) {
            temp_2020 = temp_2020.next;
        }

        if (temp_2020 == null) {
            System.out.println("Posisi di luar jangkauan");
        } else {
            NodeSLL_2020 newNode_2020 = GetNode(value_2020);
            newNode_2020.next = temp_2020.next;
            temp_2020.next = newNode_2020;
        }
        return headNode_2020;
    }

    public static void printList_2020(NodeSLL_2020 head) {
        NodeSLL_2020 curr_2020 = head;
        while (curr_2020 != null) {
            System.out.print(curr_2020.data + (curr_2020.next != null ? "-->" : ""));
            curr_2020 = curr_2020.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Menggunakan class NodeSLL_2020 secara konsisten
        NodeSLL_2020 head_2020 = new NodeSLL_2020(2);
        head_2020.next = new NodeSLL_2020(3);
        head_2020.next.next = new NodeSLL_2020(5);
        head_2020.next.next.next = new NodeSLL_2020(6);

        System.out.print("Senarai berantai awal: ");
        printList_2020(head_2020);

        System.out.print("Tambah 1 simpul di belakang (7): ");
        int data2_2020 = 7;
        head_2020 = insertAtEnd(head_2020, data2_2020);
        printList_2020(head_2020);

        System.out.print("Tambah 1 simpul ke posisi 4 (data 4): ");
        int data3_2020 = 4;
        int pos_2020 = 4;
        head_2020 = insertPos(head_2020, pos_2020, data3_2020);
        printList_2020(head_2020);
    }
    
}
