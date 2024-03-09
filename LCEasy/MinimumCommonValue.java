package LCEasy;

// TC O(n+m) and SC O(1) no space used
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // 2 pointer approach fastest
        for(int i =0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]) return nums1[i];
            else if( nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
    }
}


------------------------------------------------------------

// Approach-1 (Using set)
// T.C : O(m+n)
// S.C : O(m)
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }

        return -1;
    }
}

