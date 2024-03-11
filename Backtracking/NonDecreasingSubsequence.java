package Backtracking;

public class NonDecreasingSubsequence {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        // Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        return result;
    }

    public void solve(int[] nums, int idx, List<Integer> temp) {
        if (temp.size() >1) {
            result.add(new ArrayList<>(temp));
            // return;
        }
        Set<Integer> st = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if ((temp.size()==0 || nums[i] >= temp.get(temp.size() - 1)) && !st.contains(nums[i])) {
                temp.add(nums[i]);
                st.add(nums[i]);
                solve(nums, i + 1, temp);
                temp.remove(temp.size() - 1);
                // st.remove(nums[idx]);
                // solve(nums,idx+1,temp);
            }
        }

        // if(!st.contains(nums[idx]))

    }
}
