package myLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int item) {
        val = item;
        next = null;
    }
}

public class IntersectionOfTwoLinkedList {
public static ListNode intersectionPoint(ListNode head1,ListNode head2){
    int lena=getLength1(head1);
    int lenb=getLength1(head2);
    if(lena==0 || lenb==0){
        return null;
    }
    while (lena>lenb){
    head1=head1.next;
    lena--;
    }
    while (lenb>lena){
        head2=head2.next;
        lena--;
    }
    while (head1!=head2){
        head1=head1.next;
        head2=head2.next;
    }
    return head2;

}
private static  int getLength1(ListNode node){
    int len=0;
    while (node!=null){
        len++;
        node=node.next;
    }
    return len;

}

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(4);
        ListNode a7 = new ListNode(9);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        b1.next=b2;
        b2.next=b3;
        b3.next=a7;
        ListNode ans=intersectionPoint(a1,b1);
        System.out.println(ans.val);
    }
}
