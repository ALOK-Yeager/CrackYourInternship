class Solution {
    public void gameOfLife(int[][] board) {
        int[][] clone = new int[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                clone[i][j] = board[i][j];
            }
        }
        
        //  RULES OF THE GAME 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int live = findLive(i, j, clone);
                
                if (clone[i][j] == 1) { 
                    if (live == 2 || live == 3) {
                        board[i][j] = 1;  
                    } else {
                        board[i][j] = 0;  
                    }
                } else {  
                    if (live == 3) {
                        board[i][j] = 1;  
                    } else {
                        board[i][j] = 0;  
                    }
                }
            }
        }
    }
    
    private int findLive(int i, int j, int[][] board) {
        int live = 0;
        
        
        int[][] directions = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
        
        for (int[] direction : directions) {
            int ni = i + direction[0];
            int nj = j + direction[1];
            
            if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length) {
                if (board[ni][nj] == 1) {
                    live++;
                }
            }
        }
        
        return live;
    }
}
