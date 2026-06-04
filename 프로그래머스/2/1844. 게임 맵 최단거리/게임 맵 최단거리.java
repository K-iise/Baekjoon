import java.util.*;

class Solution {
    static int row, col;
    static int matrix[][];
    static boolean visit[][];

    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int answer = 0;
        row = maps.length;
        col = maps[0].length;
        matrix = new int[row][col];
        visit = new boolean[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = maps[i][j];
            }
        }
        
        answer = bfs(0, 0, row-1, col-1);

        return answer;
    }

    public static int bfs(int x1, int y1, int x2, int y2) {
        Queue<int []> q = new ArrayDeque<>();
        q.offer(new int[] {x1, y1, 1});
        visit[x1][y1] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            if (x == x2 && y == y2) {
                return curr[2];
            }

            for(int i = 0; i < 4; i++) {
                int px = x + dx[i];
                int py = y + dy[i];
                if (px >= 0 && px < row && py >= 0 && py < col && matrix[px][py] == 1 &&  !visit[px][py]) {
                    q.offer(new int[] {px, py, curr[2] + 1});
                    visit[px][py] = true;
                }
            }
        }

        return -1;
    }
}