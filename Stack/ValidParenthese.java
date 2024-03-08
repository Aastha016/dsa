package Stack;

class Solution {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                //opening so push
                st.push('(');
            }
            else if(s.charAt(i)=='[')
            {
                //opening so push
                st.push('[');
            }
            else if(s.charAt(i)=='{')
            {
                //opening so push
                st.push('{');
            }
            else if(s.charAt(i)==')'){
                //closing so pop
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                //closing so pop
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                //closing so pop
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}