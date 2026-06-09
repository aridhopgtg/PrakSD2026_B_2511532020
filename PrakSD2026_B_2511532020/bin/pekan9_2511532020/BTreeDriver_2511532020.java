package pekan9_2511532020;

public class BTreeDriver_2511532020 {
    public static void main (String[] args) {
        
        // Pembuatan objek pohon yang benar (menggunakan underscore)
        BTree_2511532020 tree_2020 = new BTree_2511532020();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_2020.countNodes_2020());
        
        // Menambahkan simpul data 1
        Node_2511532020 root_2020 = new Node_2511532020(1);
       
        tree_2020.setRoot_2020(root_2020);
        System.out.println("Jumlah simpul jika hanya ada root:");
        System.out.println(tree_2020.countNodes_2020());
        
        // Inisialisasi node-node lainnya
        Node_2511532020 node2_2020 = new Node_2511532020(2);
        Node_2511532020 node3_2020 = new Node_2511532020(3);
        Node_2511532020 node4_2020 = new Node_2511532020(4);
        Node_2511532020 node5_2020 = new Node_2511532020(5);
        Node_2511532020 node6_2020 = new Node_2511532020(6);
        Node_2511532020 node7_2020 = new Node_2511532020(7);
        Node_2511532020 node8_2020 = new Node_2511532020(8);
        Node_2511532020 node9_2020 = new Node_2511532020(9);
        
        // Menyusun Struktur Tree
        root_2020.setLeft_2020(node2_2020);
        node2_2020.setLeft_2020(node4_2020);
        node2_2020.setRight_2020(node5_2020);
        node4_2020.setRight_2020(node8_2020);
        
        root_2020.setRight_2020(node3_2020);
        node3_2020.setLeft_2020(node6_2020);
        node3_2020.setRight_2020(node7_2020);
        node6_2020.setLeft_2020(node9_2020);
        
        // Set current node ke root
        tree_2020.setCurrent_2020(tree_2020.getRoot_2020());
        System.out.println("Menampilkan data simpul current (root): ");
        System.out.println(tree_2020.getCurrent_2020().getData_2020());
        
        System.out.println("Jumlah simpul setelah seluruh simpul ditambahkan:");
        System.out.println(tree_2020.countNodes_2020());
        
        System.out.println("\nInOrder: ");
        tree_2020.printInorder_2020();
        
        System.out.println("\n\nPreorder: ");
        tree_2020.printPreOrder_2020();
        
        System.out.println("\n\nPostorder: ");
        tree_2020.printPostorder_2020();
        
        System.out.println("\n\nMenampilkan simpul dalam bentuk pohon:");
        tree_2020.print_2020();
    }
}