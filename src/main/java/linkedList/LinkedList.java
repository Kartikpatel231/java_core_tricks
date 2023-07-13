package linkedList;

public class LinkedList {
    private class Node {
        private int data;
        private Node next;
    }

    //summary object
    private Node head;
    private Node tail;
    private int size;

    //display Linked element
    void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            System.out.println("---------------------------------");
        }
    }

    void addLast(int item) {
        //create new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        //attach
        if (this.size >= 1) {
            this.tail.next = nn;
        }


        //summary object
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }

    }

    void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if (this.size >= 1) {
            nn.next = head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }
    }

    void getFirst() {
        System.out.println(this.head.data);
        System.out.println(this.head.next);
    }

    void getLast() {
        System.out.println(this.tail.data);
        System.out.println(this.tail.next);
    }

    void getMiddle(int item) {
        for (int i = 1; i < item; i++) {
            if (i <= size) {
                System.out.println(this.head.data);

            }
        }
    }


}




























































//private class Node {
//        private int data;
//        private Node next;
//    }
//
//    //summary object
//    private Node head;
//    private Node tail;
//    private int size;
//
//    //display Linked element
//    void display() {
//        Node temp = this.head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//            System.out.println("---------------------------------");
//        }
//    }
//
//    void addLast(int item) {
//        //create new node
//        Node nn = new Node();
//        nn.data = item;
//        nn.next = null;
//        //attach
//        if (this.size >= 1) {
//            this.tail.next = nn;
//        }
//
//
//        //summary object
//        if (this.size == 0) {
//            this.head = nn;
//            this.tail = nn;
//            this.size++;
//        } else {
//            this.tail = nn;
//            this.size++;
//        }
//
//    }
//
//    void addFirst(int item) {
//        Node nn = new Node();
//        nn.data = item;
//        nn.next = null;
//
//        //attach
//        if (this.size >= 1) {
//            this.head.next = nn;
//        }
//        if (this.size == 0) {
//            this.head = nn;
//            this.tail = nn;
//            this.size++;
//        } else {
//            this.head = nn;
//            this.size++;
//        }
//    }
//
//    void getFirst() {
//        System.out.println(this.head.data);
//        System.out.println(this.head.next);
//    }
//
//    void getLast() {
//        System.out.println(this.tail.data);
//        System.out.println(this.tail.next);
//    }
//
//    void getMiddle(int item) {
//        for (int i = 0; i < item; i++) {
//            if (i <= size) {
//                System.out.println(this.head.data);
//
//            }
//        }
//    }