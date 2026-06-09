package pekan9_2511532020;

public class BTree_2511532020 {
    private Node_2511532020 root_2020;
    private Node_2511532020 currentNode_2020;
    
    public BTree_2511532020() {
        root_2020 = null;
    }
    
    public boolean search_2020(int data_2020) {
        return search_2020(root_2020, data_2020);
    }
    
    private boolean search_2020(Node_2511532020 node_2020, int data_2020) {
        if (node_2020.getData_2020() == data_2020)
            return true;
        if (node_2020.getLeft_2020() != null)
            if (search_2020(node_2020.getLeft_2020(), data_2020))
                return true;
        if (node_2020.getRight_2020() != null)
            if (search_2020(node_2020.getRight_2020(), data_2020))
                return true;
        return false;
    }
    
    public void printInorder_2020() {
        root_2020.printInorder_2020(root_2020);
    }
    
    public void printPreOrder_2020() {
        root_2020.printPreorder_2020(root_2020);
    }
    
    public void printPostorder_2020() {
        root_2020.printPostorder_2020(root_2020);
    }
    
    public Node_2511532020 getRoot_2020() {
        return root_2020;
    }
    public boolean isEmpty_2020() {
        return root_2020 == null;
    }
    
    public int countNodes_2020() {
        return countNodes_2020(root_2020);
    }
    
    private int countNodes_2020(Node_2511532020 node_2020) {
        int count = 1;
        if (node_2020 == null) {
            return 0;
        } else {
            count += countNodes_2020(node_2020.getLeft_2020());
            count += countNodes_2020(node_2020.getRight_2020());
            return count;
        }
    }
    
    public void print_2020() {
        root_2020.print_2020();
    }
    
    public Node_2511532020 getCurrent_2020() {
        return currentNode_2020;
    }
    
    public void setCurrent_2020(Node_2511532020 node_2020) {
        this.currentNode_2020 = node_2020;
    }
    
    public void setRoot_2020(Node_2511532020 root_2020) {
        this.root_2020 = root_2020;
    }
}
