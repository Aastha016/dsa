package LinkedList;

public class FlattenBSTtoSortedList {
    public Node flattenBST(Node root) {
        // Code here

        if(root == null)
            return null;

        Node head = flattenBST(root.left);
        root.left = null;
        root.right = flattenBST(root.right);
        if(head == null){
            head=root;
        }
        else{
            Node temp = head;
            while(temp!=null && temp.right!=null){
                temp=temp.right;
            }
            temp.right = root;

        }
        return head;

    }
}
