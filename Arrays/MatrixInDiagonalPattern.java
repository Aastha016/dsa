package Arrays;

public class MatrixInDiagonalPattern {
    public int[] matrixDiagonally(int[][] mat) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        int n = mat.length;
        int [] result = new int [n*n];

        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(hm.containsKey(i+j)){
                    List<Integer> list = hm.get(i+j);
                    list.add(mat[i][j]);
                }
                else{
                    //not contains
                    List<Integer> list = new ArrayList<>();
                    list.add(mat[i][j]);
                    hm.put(i+j,list);
                }
            }
        }

        int k =0;

        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet()){
            int key = entry.getKey();
            List<Integer> list = entry.getValue();

            if(key%2==0){
                //right to left
                for(int i =list.size()-1;i>=0;i--){
                    result[k]=list.get(i);
                    k++;
                }
            }
            else{
                for(int i =0;i<list.size();i++){
                    result[k]=list.get(i);
                    k++;
                }
            }
        }
        return result;

    }
}
