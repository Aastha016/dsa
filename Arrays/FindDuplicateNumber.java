package Arrays;

// implementation of flyod cycle but for arrays
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        s=nums[s];
        f=nums[nums[f]];
        while(s!=f){
            s=nums[s];
            f=nums[nums[f]];
        }
        //cycle is present


        s = nums[0];
        while(s!=f){
            s=nums[s];
            f=nums[f];
        }
        return s;
    }
}
