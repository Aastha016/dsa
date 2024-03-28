package SlidingWindow;

public class LongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int len =0;
        while (j <n) {

            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);

            while(i<j && hm.get(nums[j])>k){
                hm.put(nums[i],hm.get(nums[i])-1);
                i++;
            }
            len =Math.max(len,j-i+1);
            j++;
        }

        return len;
    }
}
