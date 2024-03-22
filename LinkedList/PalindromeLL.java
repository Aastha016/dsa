package LinkedList;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        int size = 0;
        ListNode temp = head;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        // reverse first half

        ListNode h = reverseList(slow);
        while(h!=null) {
            if(head.val!=h.val) return false;
            head=head.next;
            h=h.next;
        }
        return true;


    }

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
