import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0;
        int col = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            row = Math.max(row, w);
            col = Math.max(col, h);
        }
        
        
        answer = row * col;
        return answer;
    }
}