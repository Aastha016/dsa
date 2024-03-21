package Trees;

public class ZigZagTraversal {
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        int level =1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0;i<size;i++){
                Node temp = q.remove();
                list.add(temp.data);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(level%2 == 1){
                //left to right
                for(int i =0;i<size;i++){
                    ans.add(list.get(i));
                }
            }
            else{
                //right to left
                for(int i =size-1;i>=0;i--){
                    ans.add(list.get(i));
                }
            }
            level++;

        }
        return ans;
    }
}
