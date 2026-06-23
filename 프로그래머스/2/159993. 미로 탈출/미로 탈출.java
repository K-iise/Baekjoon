import java.util.*;

class Solution {
    boolean visit[][];
    static int X, Y;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    
    static int startX, startY;
    static int leberX, leberY;
    static int endX, endY;
    
    public int solution(String[] maps) {
        int answer = 0;
        X = maps.length;
        Y = maps[0].length();
        
        visit = new boolean[X][Y];
        
        for(int i = 0; i < maps.length; i++) {
            for(int j = 0; j < maps[i].length(); j++) {
                if(maps[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                }
                if(maps[i].charAt(j) == 'E') {
                    endX = i;
                    endY = j;
                }
                if(maps[i].charAt(j) == 'L') {
                    leberX = i;
                    leberY = j;
                }
            }
        }
        
        int toLever = bfs(maps, startX, startY, leberX, leberY);
        if (toLever == -1) return -1;    

        int toExit = bfs(maps, leberX, leberY, endX, endY);
        if (toExit == -1) return -1; 
        
        answer = toLever + toExit;
        return answer;
    }
    
    public int bfs(String[] maps, int x1, int y1, int ex, int ey) {        
        Queue<int[]> q = new LinkedList<>();
        visit = new boolean[X][Y];
        q.offer(new int[]{x1, y1, 0});
        visit[x1][y1] = true;
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            
            if (x == ex && y == ey) {
                return curr[2];
            }
        
            for(int i = 0; i < 4; i++){
                int px = x + dx[i];
                int py = y + dy[i];

                if(px >= 0 && px < X && py >= 0 && py < Y
                   && !visit[px][py] && maps[px].charAt(py) != 'X') {
                    q.offer(new int[]{px, py, curr[2] + 1});
                    visit[px][py] = true;
                }
            }
        }
        return -1;
    }
}