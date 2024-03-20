package LinkedList;

public class MergeInBetweenLL {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int c1 =0;
        ListNode start = list1;
        ListNode prev=null;

        while(c1!=a && start.next!=null){
            c1++;
            prev = start;
            start = start.next;
        }
        prev.next= list2;

        while(c1!=b && start.next!=null){
            c1++;
            start=start.next;
        }
        while(list2.next!=null&& list2!=null){
            list2=list2.next;
        }
        list2.next=start.next;
        return list1;
    }
}
