package Arrays;

//consider the elements as the index  --> pattern [1,n] elements
public class FindAllDuplicates {
    List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
        if (Math.abs(arr[i]) - 1 <= arr.length - 1 && arr[Math.abs(arr[i]) - 1] < 0) {
            // -ve number therefore we'll add but list should not have it
            // if(!ans.contains(arr[Math.abs(arr[i])])){
            ans.add(Math.abs(arr[i]));
            // }
        } else if (Math.abs(arr[i]) - 1 <= arr.length - 1) {
            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }
    }

        return ans;
}
}
