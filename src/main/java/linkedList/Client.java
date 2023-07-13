package linkedList;

public class Client {
    public static void main(String[] args) throws Exception {
//        LinkedList obj=new LinkedList();
//        obj.addLast(10);
//        obj.addLast(20);
//        obj.addLast(30);
//        obj.addLast(40);
//        obj.addFirst(30);
//        obj.display();
        CreateLinkedList obj1=new CreateLinkedList();
        obj1.addFirst(30);
        obj1.addLast(500);
        obj1.addFirst(40);
        obj1.addLast(53);
        obj1.addFirst(50);
        obj1.display();
        obj1.getFirst();
        obj1.getLast();
        int ans=obj1.getAt(3);
        System.out.println(ans);
        obj1.addAt(4,2);
        obj1.display();
    }
}
