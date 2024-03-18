package Arrays;

public class MinimumNoOfBallons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a -> a[0]) );

        int n = points.length;
        int count =1;
        if(n==1) return 1;
        if(n==0) return 0;


        int prevsp=points[0][0];
        int prevep= points[0][1];

        for(int i =1;i<n ;i++){
            int cursp=points[i][0];
            int curep= points[i][1];
            if(cursp>prevep){
                prevsp=cursp;
                prevep=curep;
                count++;
            }
            else{
                prevsp = Math.max(cursp,prevsp);
                prevep = Math.min(curep,prevep);
            }

        }
        return count;
    }
}
