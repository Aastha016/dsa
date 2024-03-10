package LCEasy;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] == nums2[j]) {
                if (ans.contains(nums1[i])) {
                    i++;j++;
                }
                else {
                    ans.add(nums1[i]);
                    i++;
                    j++;
                }
            } else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}