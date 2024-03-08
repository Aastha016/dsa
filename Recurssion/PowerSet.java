package Recurssion;

public class PowerSet {

    private List<String> ans = new ArrayList<>();

    public void solve(String s , StringBuilder curr , int index){
        //base case
        if(index == s.length())
        {
            if(curr.length()>0){
                ans.add(curr.toString());
            }
            return;
        }
        curr.append(s.charAt(index));
        solve(s,curr,index+1);
        curr.deleteCharAt(curr.length()-1);
        solve(s,curr,index+1);
    }

    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        StringBuilder curr = new StringBuilder();
        solve(s,curr,0);
        Collections.sort(ans);
        return ans;
    }
}
