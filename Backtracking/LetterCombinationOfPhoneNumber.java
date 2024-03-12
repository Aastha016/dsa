package Backtracking;

public class LetterCombinationOfPhoneNumber {
    HashMap<Character,String> hm = new HashMap<>();
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        if(digits.length()==0)
            return new ArrayList<>();
        solve(0,digits,"");
        return result;

    }

    public void solve(int idx , String digits,String temp){

        if(temp.length() == digits.length()){
            result.add(temp);
            return;
        }
        if(temp.length()>digits.length()) return;
        char ch = digits.charAt(idx);
        String str = hm.get(ch);
        for(int i =0;i<str.length();i++){

            StringBuilder s = new StringBuilder(temp);
            s.append(str.charAt(i));
            temp = s.toString();
            solve(idx+1,digits,temp);
            temp = temp.substring(0,temp.length()-1);
            //    solve(idx+1,digits,temp);
        }
    }
}
