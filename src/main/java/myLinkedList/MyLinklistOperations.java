package myLinkedList;

class Node{
    int val;
    Node next;
}
public class MyLinklistOperations {
    Node head;
    public  void addFirst(int item){
        Node newObj=new Node();
        newObj.val=item;
        newObj.next=null;

        if(head==null){
        head=newObj;
        }
        else {
            Node temp=head;
            head=newObj;
            newObj=temp;;
        }
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        MyLinklistOperations obj=new MyLinklistOperations();
        obj.display();
        obj.addFirst(12);
        obj.display();
    }
}
