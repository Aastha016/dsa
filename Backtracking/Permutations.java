package Backtracking;


import java.util.HashSet;

/*
* the time complexity of list.contains is O(n) therefore to reduce that
* we can use a set becoz Tc of contains in set is O(1) and not O(n)
*
*
*
* */
public class Permutations {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> st = new HashSet<Integer>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(nums,temp);
        return result;
    }
    public void solve(int [] nums, List<Integer> temp){
        if(temp.size() == nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!st.contains(nums[i])){
                temp.add(nums[i]);
                st.add(nums[i]);
                solve(nums,temp);
                temp.remove(temp.size()-1);
                st.remove(nums[i]);
                // solve(nums,temp);
            }
        }
    }
}
