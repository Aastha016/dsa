package LCEasy;
/*
2 approaches
1 --> use hashmap and then on the values sort them and if max
once u have max add the frequencies with max freq
T C --> nlogn + n
S C --> O(n)

2 --> create frequency array and find max
once u have max add elements with max freq

T C --> O(n + n) 2 pass solution
S C --> O(1) 101 size

3 --> one pass solution
T C --> O(n)


*/


class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int res = 0;
        int arr [] = new int [101];
        Arrays.fill(arr,0);
        for(int n : nums){
            arr[n]++;
            int freq = arr[n];
            if(freq>max){
                max = freq;
                res = max;
            }
            else if(freq ==max){
                res+=max;
            }

        }
        // for(int i =0;i<101;i++){
        //     if(arr[i]==max)
        //     res+=arr[i];
        // }
        return res;
    }
}