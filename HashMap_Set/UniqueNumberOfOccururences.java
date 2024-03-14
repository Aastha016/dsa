package HashMap_Set;

public class UniqueNumberOfOccururences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Integer> valueList = new ArrayList<>();
        for (int i : hm.values()) {
            if (valueList.contains(i))
                return false;
            else
                valueList.add(i);
        }
        return true;
    }
}



--------------------------------------------------------------------------
//Approach 2 without auxilary space

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int a  [] = new int [2001];
        Arrays.fill(a,0);

        for(int i =0;i<arr.length;i++){
            int num = 1000+arr[i];
            a[num]++;
        }
        Arrays.sort(a);

        for(int i =1;i<2001;i++){
            if(a[i]!=0 && a[i]==a[i-1])
                return false;
        }
        return true;

    }
