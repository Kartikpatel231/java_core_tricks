package mytree;
public class Tree {
    class Node {
        int val;
        Node right, left;
        Node(int item) {
            this.val = item;
            left = right = null;
        }
    }
    public Node root;
    // Method to insert an element into the BST
    public void insetElement(int value) {
        root = insertInRoot(root, value);
    }
    // Recursive helper method to insert an element into the BST
    public Node insertInRoot(Node root, int value) {
        if (root == null) {
            return new Node(value);
        } else if (value < root.val) {
            root.left = insertInRoot(root.left, value);
        } else if (value > root.val) {
            root.right = insertInRoot(root.right, value);
        }
        return root;
    }
    // Method to display the elements of the BST in-order
    public void displayInPlaceOrder(Node node) {
        if (node == null) {
            return; }
        displayInPlaceOrder(node.left);
        System.out.print(" " + node.val);
        displayInPlaceOrder(node.right);
    }

    public void displayPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(" " + node.val);
        displayInPlaceOrder(node.left);
        displayInPlaceOrder(node.right);
    }
    public void displayPostOrder(Node node) {
        if (node == null) {
            return;
        }
        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.print(" " + node.val);
        }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insetElement(12);
        tree.insetElement(13);
        tree.insetElement(11);
        tree.insetElement(10);
        tree.insetElement(9);
        tree.insetElement(14);
        tree.insetElement(15);
        System.out.println(" \n In Place Traversal ");
        tree.displayInPlaceOrder(tree.root);
        System.out.println(" \n PreOrder Traversal ");
        tree.displayPreOrder(tree.root);
        System.out.println(" \n PostOrder Traversal");
        tree.displayPostOrder(tree.root);
    }
}







