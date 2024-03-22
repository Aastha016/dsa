package Recurssion;

public class FibobacciWithDP {
    int ans [];
    public static final int MOD = 1000000007;
    int[] Series(int n) {
        // code here
        ans = new int [n+1];
        Arrays.fill(ans,-1);
        ans[0]=0;
        ans[1]=1;


        for(int i =2;i<n+1;i++){
            ans[i]=solve(i%MOD);
        }
        return ans;
    }

    int solve(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        if(ans[n]!=-1) return ans[n];
        return ans[n]= (solve(n-1)+solve(n-2))%MOD;
    }
}
