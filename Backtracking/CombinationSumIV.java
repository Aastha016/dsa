package Backtracking;

public class CombinationSumIV {

    int dp[][] = new int[201][1001];

    public int combinationSum4(int[] nums, int target) {

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, nums, target);
    }

    public int solve(int idx, int[] nums, int target) {
        if (target == 0) {

            return 1;
        }

        if (idx >= nums.length || target < 0)
            return 0;

        if (dp[idx][target] != -1) {
            // dp[idx][target]=take+not_take;
            return dp[idx][target];
        }

        int take = solve(0, nums, target - nums[idx]);
        int not_take = solve(idx + 1, nums, target);

        return dp[idx][target] = take + not_take;

    }
}
