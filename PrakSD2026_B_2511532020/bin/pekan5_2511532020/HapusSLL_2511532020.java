package pekan5_2511532020;

public class HapusSLL_2511532020 {

    public static NodeSLL_2020 deleteHead_2020(NodeSLL_2020 head_2020) {
        if (head_2020 == null) return null;
        return head_2020.next;
    }

    public static NodeSLL_2020 removeLastNode_2020(NodeSLL_2020 head_2020) {
        // Cek jika list kosong atau hanya punya 1 simpul
        if (head_2020 == null || head_2020.next == null) {
            return null;
        }

        NodeSLL_2020 secondLast_2020 = head_2020;
        while (secondLast_2020.next.next != null) {
            secondLast_2020 = secondLast_2020.next;
        }
        secondLast_2020.next = null;
        return head_2020;
    }

    public static NodeSLL_2020 deleteNode_2020(NodeSLL_2020 head_2020, int position_2020) {
        if (head_2020 == null) return null;

        // Jika hapus posisi pertama
        if (position_2020 == 1) {
            return head_2020.next;
        }

        NodeSLL_2020 temp_2020 = head_2020;
        NodeSLL_2020 prev_2020 = null;

        // Cari node pada posisi yang diinginkan
        for (int i = 1; temp_2020 != null && i < position_2020; i++) {
            prev_2020 = temp_2020;
            temp_2020 = temp_2020.next;
        }

        // Jika posisi ditemukan
        if (temp_2020 != null && prev_2020 != null) {
            prev_2020.next = temp_2020.next;
        } else {
            System.out.println("Posisi " + position_2020 + " tidak ditemukan.");
        }

        return head_2020;
    }

    public static void printList_2020(NodeSLL_2020 head_2020) {
        if (head_2020 == null) {
            System.out.println("List kosong.");
            return;
        }
        NodeSLL_2020 curr_2020 = head_2020;
        while (curr_2020 != null) {
            System.out.print(curr_2020.data + (curr_2020.next != null ? "-->" : ""));
            curr_2020 = curr_2020.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2020 head_2020 = new NodeSLL_2020(1);
        head_2020.next = new NodeSLL_2020(2);
        head_2020.next.next = new NodeSLL_2020(3);
        head_2020.next.next.next = new NodeSLL_2020(4);
        head_2020.next.next.next.next = new NodeSLL_2020(5);
        head_2020.next.next.next.next.next = new NodeSLL_2020(6);

        System.out.print("List awal: ");
        printList_2020(head_2020);

        head_2020 = deleteHead_2020(head_2020);
        System.out.print("Setelah head dihapus: ");
        printList_2020(head_2020);

        head_2020 = removeLastNode_2020(head_2020);
        System.out.print("Setelah simpul terakhir dihapus: ");
        printList_2020(head_2020);

        int pos_2020 = 2;
        head_2020 = deleteNode_2020(head_2020, pos_2020);
        System.out.print("Setelah posisi " + pos_2020 + " dihapus: ");
        printList_2020(head_2020);
    }
}