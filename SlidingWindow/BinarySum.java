package SlidingWindow;

public class BinarySum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // hm.put(0, 1);
        // int currSum = 0;
        // int result=0;
        // for (int i : nums) {
        // currSum += i;
        // int rs = currSum - goal;
        // if(hm.containsKey(rs)){
        // result +=hm.get(rs);
        // }
        // hm.put(currSum,hm.getOrDefault(currSum,0)+1);

        // }
        // return result;
        int count = 0;
        int i = 0, j = 0;
        int ws = 0;
        int countOfZero =0;
        while (j < nums.length) {
            ws += nums[j];
            while(i<j &&(nums[i]==0 || ws > goal)){
                if(nums[i]==0){
                    countOfZero++;
                }
                else{
                    countOfZero=0;
                }
                ws-=nums[i];
                i++;
            }
            if (ws == goal) {
                count+=1+countOfZero;
                // j++;
            }
            j++;

        }
        return count;
    }
}
