package LinkedList;

public class ReOrderLL {
    public void reorderList(ListNode head) {

        if (head != null && head.next != null) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            // breaking
            prev.next = null;

            ListNode tail = reverse(slow);
            ListNode start = head;
            // ListNode t1 ;
            // ListNode t2 ;

            while (start != null && tail != null) {
                ListNode t1 = start.next;
                ListNode t2 = tail.next;
                start.next = tail;
                if (t1 != null) {
                    tail.next = t1;
                }
                start = t1;
                tail = t2;
            }
        }
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode temp = head.next;

        while (temp != null) {
            head.next = prev;
            prev = head;
            head = temp;
            temp = temp.next;
        }
        head.next = prev;
        return head;

    }
}
