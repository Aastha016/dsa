package Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st = new Stack<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                //push the index
                st.push(i);
            }
            else if(ch ==')' && !st.isEmpty()){
                st.pop();
            }
            else if(ch ==')' && st.isEmpty()){
                set1.add(i);
            }
        }

        while(!st.isEmpty()){
            set1.add(st.pop());
        }

        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(!set1.contains(i)){
                str.append(s.charAt(i));
            }
        }

        return str.toString();


    }
}
