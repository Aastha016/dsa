package Backtracking;

public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        solve(0,0,target,candidates,temp);
        return result;
    }

    public void solve(int idx , int sum , int target , int [] candidates , List<Integer> temp)
    {
        if(sum == target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(idx>=candidates.length || sum >target) return;

        temp.add(candidates[idx]);
        solve(idx,sum+candidates[idx],target,candidates,temp);
        temp.remove(temp.size()-1);
        solve(idx+1,sum,target,candidates,temp);


    }
}
