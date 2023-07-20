package myLinkedList;

public class LinkedClass {
    class Node {
        int val;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }


    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        nn.next = null;
        //attachment
        if(size>=1){
            nn.next=head;
        }
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            head=nn;
            size++;
        }
    }
    public void addLast(int item){
        Node nn=new Node();
        nn.val=item;
        nn.next=null;
        //attachment
        if(size>=1){
            tail.next=nn;
            }
            if(size==0){
            head=nn;
            tail=nn;
            size++;
            }
            else {
            tail=nn;
            size++;
            }
    }
    public int getFirst(){
        Node temp=head;
        return temp.val;
    }
    public int getLast(){
        Node temp=tail;
        return tail.val;
    }
    public int getAt(int id){
        if(size==0){
            System.out.println("Linked list is empty");
        }
        else if(id<0 || id>size){
            System.out.println("Linked list size will be greater");
        }
        Node temp=head;

        for(int i=1;i<id;i++){
            temp=temp.next;
        }
        return temp.val;

    }
    public Node getNodeAt(int id){
        if(size==0){
            System.out.println("Linked Node is empty");
        }
        else if(id<0 || id>size){
            System.out.println("Linked Node size will be greater");
        }
        Node temp=head;

        for(int i=0;i<id;i++){
            temp=temp.next;
        }
        return temp;

    }
    public void addMiddle(int idx,int item){
        if(idx==0){
           addFirst(item);
            System.out.println("first element");

        }
        else if(size==idx){
            addLast(item);
            System.out.println("last element");
        }
        else if(size<idx || idx<-1){
            System.out.println("linked list not have that much size");
        }
        else {
                    Node nn=new Node();
                    nn.val=item;
                    Node np1=getNodeAt(idx-1);
                    Node np2=np1.next;
                    np1.next=nn;
                    nn.next=np2;
                    System.out.println("return");
                }

            }

         public int removeFirst(){
        if(this.size==0){
            System.out.println("ll is empty");
        }

         int rm=head.val;
         if(size==1){
             head=null;
             tail=null;
             size=0;
         }
         else {
             head=head.next;
             size--;
         }
         return rm;
         }
         public int removeLast(){
        if(size==0) {
            System.out.println("ll is empty");
        }
            int rm=tail.val;
            if(size==1){
                head=null;
                tail=null;
                size--;
            }
            else {
                Node np1=getNodeAt(size-2);
                tail=np1;
                tail.next=null;
                size--;
            }
             return rm;
            }
            public void removeIndex(int id){
                 if(size==0)
                 System.out.println("ll is empty");
                 else if(id<0 || id>=size){
                     System.out.println("id is greater then size");
                 }
                 if(id==1){
                     removeFirst();
                 }
                 if(id==size-1){
                     removeLast();
                 }
                 else {
                     Node np1=getNodeAt(id-1);

                     Node np2=getNodeAt(id+1);
                     np1.next=np2;
                     size--;
                 }
            }
            public void traversal(){
            int left=0;
            int right=size-1;
            while (left<right){
                Node le=getNodeAt(left);
                Node re=getNodeAt(right);
                int temp=le.val;
                le.val=re.val;
                re.val=temp;
                left++;
                right--;

            }
            }
            public  void traversalPointer(){
             Node previous=head;
             Node current=previous.next;
             while (current!=null){
                 Node ahead=current.next;
                 current.next=previous;

                 previous=current;
                 current=ahead;

             }

             Node t=head;
             head=tail;
             tail=t;
             tail.next=null;
            }
            public void midNode(){
            Node slow=head;
            Node fast=head;
            while (fast.next!=null && fast.next.next!=null){
                fast=fast.next;
                slow=slow.next;

            }
                System.out.println(slow.val);
            }
        }

