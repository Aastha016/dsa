package Backtracking;

public class CombinationSumIII {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp = new ArrayList<>();
        solve(1, 0, k, n, temp);
        return result;
    }

    public void solve(int idx, int sum, int k, int n, List<Integer> temp) {
        if (temp.size() == k) {
            if (sum == n)
                result.add(new ArrayList<>(temp));
            return;
        }
        if (sum > n || idx > 9)
            return;

        for (int i = idx; i <= 9; i++) {
            temp.add(i);
            solve(i + 1, sum + i, k, n, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
