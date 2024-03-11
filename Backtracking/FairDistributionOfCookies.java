package Backtracking;

public class FairDistributionOfCookies {
    int result = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        int[] children = new int[k];
        solve(0, children, cookies, k);
        return result;
    }

    public void solve(int j, int[] children, int[] cookies, int k) {
        if (j >= cookies.length) {
            // int max = Arrays.stream(children).max().getAsInt(); // Finding the maximum cookies for a child
            int max =0;
            for(int cook: children)  max=Math.max(max,cook);
            result = Math.min(result, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            children[i] += cookies[j];
            solve(j + 1, children, cookies, k);
            children[i] -= cookies[j];
        }
    }
}
