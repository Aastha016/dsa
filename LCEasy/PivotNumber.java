package LCEasy;


----------------Approach 1 ------------------------------------------
class Solution {
    public int pivotInteger(int n) {
        int left [] = new int [n];
        int right [] = new int [n];
        left[0]=1;
        right[n-1]=n;
        for(int i =1;i<n;i++){
            left[i]=left[i-1]+i+1;
        }
        for(int i =n-2;i>=0;i--){
            right[i]=right[i+1]+i+1;
        }
        for(int i =0;i<n;i++){
            if(left[i]==right[i]) return i+1;
        }
        return -1;
    }
}

------------Approach 2-------------------------------------------------
class Solution {
    public int pivotInteger(int n) {
        int lSum=1,rSum=n;
        int i =1;
        int j=n;
        while(i<j){
            if(lSum<rSum){
                i++;
                lSum+=i;
            }
            else
            {
                j--;
                rSum+=j;
            }
        }

        return lSum==rSum?i:-1;
    }
}
-------------------Approach 3----------------------------------------------------------
public class PivotNumber {
    public int pivotInteger(int n) {
        int t =n*(n+1)/2;
        int p = (int)Math.sqrt(t);

        if(p*p ==t)
            return p;
        return -1;

    }
}
