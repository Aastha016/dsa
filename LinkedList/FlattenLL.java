package LinkedList;

public class FlattenLL {
    Node merge(Node l1, Node l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        Node res = null;
        if(l1.data<l2.data){
            res =l1;
            res.bottom=merge(l1.bottom,l2);

        }
        else{
            res = l2;
            res.bottom=merge(l1,l2.bottom);

        }
        return res;
    }

    Node flatten(Node root)
    {
        // Your code here
        if(root ==null )
            return root;

        Node head2 = flatten(root.next);
        return merge(root,head2);
    }
}
