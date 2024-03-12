package Backtracking;

public class LC1601 {
    int result = 0;

    public int maximumRequests(int n, int[][] requests) {

        int resultant[] = new int[n];
        Arrays.fill(resultant, 0);
        solve(0, 0, resultant, requests);
        return result;
    }


    public boolean check(int [] resultant){
        return Arrays.stream(resultant).allMatch(i-> i==0);
    }

    public  void solve(int idx, int count, int []resultant,int [] [] requests){
        if(idx >=requests.length){

            if(check(resultant)){
                result = Math.max(result,count);
            }
            return;
        }

        int from =requests[idx][0];
        int to =requests[idx][1];


        resultant[from]-=1;
        resultant[to]+=1;

        solve(idx+1,count+1,resultant,requests);
        resultant[from]+=1;
        resultant[to]-=1;
        solve(idx+1,count,resultant,requests);


    }
}
