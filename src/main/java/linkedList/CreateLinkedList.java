package linkedList;

public class CreateLinkedList {
    //node inner class
    private class Node {
             int data;
             Node next;

    }
    //summary object
    Node head;
    Node tail;
    int size;

    public void display(){
        Node temp=this.head;
        while (temp != null){
            System.out.println(temp.data);
            System.out.println("------------");
            temp=temp.next;
        }


    }
    public void addLast(int item){
        Node nn=new Node();
        nn.data=item;
        nn.next=null;

        //attach
        if(this.size>=1){
            this.tail.next=nn;
            }
         //summary object
         if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else {
            this.tail=nn;
            this.size++;
         }
    }
    public void addFirst(int item){
        Node nn=new Node();
        nn.next=null;
        nn.data=item;
        if(this.size>=1){
            //attachment
            nn.next=head;
            }
        if(size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }

        else {
            this.head=nn;
            size++;
        }
    }
    public void getFirst(){
        Node temp=this.head;
        System.out.println(temp.data);
    }
    public void getLast(){
        Node temp=this.tail;
        System.out.print(temp.data);
    }
    public int getAt(int id)throws Exception {
        Node temp=this.head;
        if(this.size==0){
            System.out.println("empty linkedList");
        }
        if(id<0 || id>size){
            throw new Exception("null pointer exception");
        }
        for (int i=1;i<id;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    private Node getNode(int id) throws Exception {
        Node temp=this.head;
        if(this.size==0){
            System.out.println("empty linkedList Node");
        }
        if(id<0||id>size){
            throw new Exception("null pointer exception");
        }
        for(int i=0;i<id;i++){
            temp=temp.next;
        }
        return temp;
    }
   public  void addAt(int item,int index) throws Exception {
        if(size==0){
            System.out.println("no index found");

        }
        if(index<0||index>size){
            throw new Exception("invalid index");
        }
        if(index==0){
            addFirst(item);
        }
        else if(index==this.size){
            addLast(item);
       }
       else {

            //create new node
            Node nn=new Node();
            nn.data=item;
            nn.next=null;
            //attach
            Node nm1=getNode(index-1);
            Node np1=nm1.next;

            nm1.next=nn;
            nn.next=np1;

            //summary object
            this.size++;
        }

   }
}
