package Backtracking;



// TC O(2^n *N)

public class PalindromePatritioning {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        backTrack(s,0,temp);
        return result;
    }
    public boolean isPalindrome(String s , int i ,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }

    public void backTrack(String s , int idx , List<String> temp){

        if(idx>=s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int  i = idx ;i<s.length();i++){
            //partition kro and check kro
            if(isPalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                backTrack(s, i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
