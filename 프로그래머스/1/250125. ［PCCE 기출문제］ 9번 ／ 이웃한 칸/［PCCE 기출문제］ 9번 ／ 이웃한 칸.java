class Solution {
    static int[] dh = {0, 1, -1, 0};
    static int[] dw = {1, 0, 0, -1};
    
    public int solution(String[][] board, int h, int w) {
        int result = 0;
        int n = board.length;
        String color = board[h][w];
        
        for(int i = 0; i < 4; i++) {
            int t = h + dh[i];
            int c = w + dw[i];
            
            if((t >= 0 && t < n) && (c >= 0 && c < n)) {
                if(board[t][c].equals(color)) {
                    ++result;
                }
                    
            }
        }
        return result;
    }
}