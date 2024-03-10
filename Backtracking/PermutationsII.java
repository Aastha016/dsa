package Backtracking;
/*
* Approach 1 --> we need to store the frequencies since numbers could be repeating
* TC --> O(N! * N) N! --> this coming from the temp which we are creating and
* then we add to result arraylist that takes another N
* SC --> O(N) --> hashmap auxilary space and recurssion stack space
*
*
* Approach 1 gives TLE
* to improve we used set to avoid duplicates and we make use of swap function to swap
* elements on i and idx which gives all permutations
*
*
*
* */
public class PermutationsII {
    List<List<Integer>> result = new ArrayList<>();
    HashMap<Integer,Integer> hm = new HashMap<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int n : nums){
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }
            else{
                hm.put(n,1);
            }
        }
        solve(nums, temp);

        return result;
    }

    public void solve(int [] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            if(result.contains(new ArrayList<>(temp)))
                return;
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i =0;i<nums.length;i++){
            if(hm.get(nums[i])>=1){
                temp.add(nums[i]);
                hm.put(nums[i],hm.get(nums[i])-1);
                solve(nums,temp);
                temp.remove(temp.size()-1);
                hm.put(nums[i],hm.get(nums[i])+1);
                // solve(nums,temp);
            }
        }
    }
}
--------------------------------------------------------------------------------------------------------------------------------
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        solve(nums, 0);

        return result;
    }

    public void solve(int[] nums, int idx) {
        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n : nums)
                temp.add(n);
            result.add(new ArrayList<>(temp));
            return;
        }

        Set<Integer> st = new HashSet<>();// avoid duplicates

        for (int i = idx; i < nums.length; i++) {
            // try all posibble i > = idx to swap with nums[idx]
            if (st.contains(nums[i]))
                continue;

            st.add(nums[i]);

            swap(nums, i, idx);

            solve(nums, idx + 1);
            // undo

            swap(nums, i, idx);

        }
    }
    public void swap(int [] nums, int i , int j){
        int a = nums[i];
        nums[i]=nums[j];
        nums[j]=a;
    }
}