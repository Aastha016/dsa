package Trees;

public class DiagonalSum {
    public static ArrayList <Integer> diagonalSum(Node root)
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            while(size>0){
                Node curr = q.remove();

                while(curr!=null){
                    if(curr.left!=null) q.add(curr.left);
                    sum+=curr.data;
                    curr =curr.right;
                }
                size--;
            }
            ans.add(sum);
        }

        return ans;
    }
}
