package myLinkedList;

public class ClientClass {
    public static void main(String[] args){
        LinkedClass obj=new LinkedClass();
        obj.addFirst(4);
        obj.addFirst(5);
        obj.addFirst(6);
        obj.addFirst(7);
        obj.addLast(10);
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        obj.display();
        System.out.println(obj.getAt(1));
        System.out.println(obj.getNodeAt(1));
        obj.addMiddle(0,8);
        obj.display();
        System.out.println(obj.removeFirst());
        System.out.println(obj.removeLast());
        obj.removeIndex(2);
        obj.display();
        obj.traversalPointer();
        obj.display();
        obj.midNode();
    }
}
