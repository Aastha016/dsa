package Backtracking;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();
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
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                solve(nums,temp);
                temp.remove(temp.size()-1);
                // solve(nums,temp);
            }
        }
    }
}
