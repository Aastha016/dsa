package Recurssion;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l = new ArrayList<>();
        solve(nums,0, l);
        return result;

    }
    public void solve(int [] nums , int index , List<Integer> list ){
        if(index >= nums.length){
            // Collections.sort(list);
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        solve(nums,index+1,list);
        list.remove(list.size()-1);
        solve(nums,index+1,list);
    }
}