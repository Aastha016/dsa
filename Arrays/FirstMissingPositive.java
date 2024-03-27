package Arrays;

// multiple pass solution but complexity remains O(n)

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean contains1 = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1)
                contains1 = true;
            else if (nums[i] <= 0 || nums[i] > len)
                nums[i] = 1;
        }
        if (contains1 == false)
            return 1;
        for (int i = 0; i < len; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                continue;
            else
                nums[idx] *= -1;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] < 0)
                continue;
            else
                return i + 1;
        }
        return len + 1;
    }
}
