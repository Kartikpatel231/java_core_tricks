package tcs;
class Node{
    int val;
    Node next;
    Node(int item){
        this.val=item;
    }
}
public class ReverseLinkedList {
    public static Node reversList(Node head){
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;  // Store next node
            current.next = prev;      // Reverse the direction of the current node's pointer
            prev = current;           // Move prev to current node
            current = nextNode;       // Move current forward
        }
        return prev;  // New head of reversed list
    }
    public static void main(String[] args){
     Node obj=new Node(5);
     Node obj1=new Node(6);
     Node obj2=new Node(7);
     obj.next=obj1;
     obj1.next=obj2;
     Node result=reversList(obj);
        while (result!=null){
            System.out.print(" "+result.val);
            result=result.next;
        }

    }
}
