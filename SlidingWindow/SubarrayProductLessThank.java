package SlidingWindow;

public class SubarrayProductLessThank {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1) return 0;
        int count = 0;
        int i = 0, j = 0;
        int p = 1;

        while ( j < nums.length) {
            p *= nums[j];
            while (p >= k) {
                p = p / nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }

        return count;
    }
}
