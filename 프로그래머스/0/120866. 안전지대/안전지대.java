import java.util.*;

class Solution {
    static int dx[] = {0, 1, -1, 0, -1, -1, 1, 1};
    static int dy[] = {1, 0, 0, -1, -1, 1, -1, 1};
    static boolean visit[][];
    
    public int solution(int[][] board) {
        int answer = board[0].length * board.length;
        int n = board.length;
        int m = board[0].length;
        int mine = 0;
        
        visit = new boolean[n][m];
        
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    mine++;
                    
                    visit[i][j] = true;
                    q.offer(new int[]{i, j});
                }
            }
        }
        
        while(!q.isEmpty()) {
            var t = q.poll();
            
            for(int i = 0; i < 8; i++) {
                int px = t[0] + dx[i];
                int py = t[1] + dy[i];
                
                if(px >= 0 && px < n && py >= 0 && py < m && !visit[px][py]) {                  
                    
                    visit[px][py] = true;
                    mine++;
                }
            }
        }
        
        return answer - mine;
    }
}