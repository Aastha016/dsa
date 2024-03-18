package Arrays;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int rows = intervals.length;

        List<int []> ans = new ArrayList<>();
        int i =0;
        while(i<rows){

            if(intervals[i][1]<newInterval[0]){
                List<Integer> list = new ArrayList<>();
                ans.add(intervals[i]);
                // i++;
            }
            else if(intervals[i][0]>newInterval[1]) break;
            else {
                // merge
                newInterval[0] =Math.min(newInterval[0],intervals[i][0]);
                newInterval[1] =Math.max(newInterval[1],intervals[i][1]);
            }
            i++;

        }
        ans.add(newInterval);

        while(i<rows){
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int [ans.size()][]);
    }
}
