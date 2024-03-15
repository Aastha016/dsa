package Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int [n];
        int p =1;
        result[0]=1;
        for(int i =1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        for(int i =n-1;i>=0;i--){
            result[i]=result[i]*p;
            p*=nums[i];
        }
        return result;

    }
}