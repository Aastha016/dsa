package LinkedList;

public class RemoveConsecutiveZeroSum {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        int ps =0;
        HashMap<Integer,ListNode> hm = new HashMap<>();
        hm.put(0,dummy);


        while(head!=null){
            ps+=head.val;
            if(hm.containsKey(ps)){
                // present that means 0 has come
                ListNode start = hm.get(ps);
                ListNode temp = start;
                int p = ps;
                while(temp!=head){
                    // hm.remove(p);
                    temp=temp.next;
                    p+=temp.val;
                    if(temp!=head)
                        hm.remove(p);
                }
                start.next=head.next;
            }else{
                hm.put(ps,head);
            }
            head=head.next;
        }

        return dummy.next;

    }
}
