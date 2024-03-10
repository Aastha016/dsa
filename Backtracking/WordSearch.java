package Backtracking;

public class WordSearch {
    int m, n;
    int[] dx = { 0, 0, -1, 1 };
    int[] dy = { 1, -1, 0, 0 };

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board,i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean find(char[][] board,int i, int j, String word, int idx) {

        if (idx == word.length()) {
            // you have seen all the character of the word
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '$')
            return false;
        if (board[i][j] != word.charAt(idx))
            return false;
        char c = board[i][j];
        board[i][j] = '$';// mark visited
        for (int a = 0; a < 4; a++) {
            int new_i = i + dx[a];
            int new_j = j + dy[a];
            if (find(board,new_i, new_j, word, idx + 1))
                return true;
        }
        board[i][j] = c;
        return false;

    }
}
