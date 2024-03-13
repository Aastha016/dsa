package Backtracking;

public class CombinationSumII {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, 0, candidates, target, temp);
        return result;
    }

    public void solve(int idx, int sum, int[] candidates, int target, List<Integer> temp) {

        if (target == sum) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (sum > target || idx >= candidates.length)
            return;

        for (int i = idx; i < candidates.length; i++) {
            if(i>idx && candidates[i]==candidates[i-1])
                continue;
            temp.add(candidates[i]);

            solve(i + 1, sum + candidates[i], candidates, target, temp);
            temp.remove(temp.size() - 1);


        }

    }
}
