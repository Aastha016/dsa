package LinkedList;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next==null)
            return head;
        ListNode prev = null;
        ListNode temp = head.next;

        while(temp!=null){
            head.next=prev;
            prev=head;
            head=temp;
            temp=temp.next;
        }
        head.next=prev;
        return head;

    }
}
