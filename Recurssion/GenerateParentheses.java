package Recurssion;

public class GenerateParentheses {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        solve("", n, 0, 0);
        return res;
    }

    public void solve(String s, int n, int open, int close) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }

        if (open < n) {
            // do
            s += '(';
            // open++;
            // explore
            solve(s, n , open + 1, close);
            // undo
            s = s.substring(0, s.length() - 1);
        }
        if (close < open) {
            s += ')';
            // close++;
            solve(s, n , open, close + 1);
            s = s.substring(0, s.length() - 1);
        }
    }

}
