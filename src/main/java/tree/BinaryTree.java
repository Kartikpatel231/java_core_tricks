package tree;

class Node{
    int val;
    Node right,left;
    Node(int item){
        this.val=item;
        left=right=null;
    }
}

public class BinaryTree {
public static Node root;
    public static Node display(Node node){
        Node temp=node;
         while (temp!=null){
             if(root.left!=null) {
                 System.out.println(root.left.val);
                 root=root.left;

             }
             else if (root.right!=null){
                 System.out.println(root.right.val);

                 root=root.right;

             }
             System.out.println(root.val);

         }

    return root;
    }
    public static void main(){
    Node node1 =new Node(12);
    Node node2=new Node(8);
    node1.left=node2;
    Node node3=new Node(14);
    node1.right=node3;

    }

}
