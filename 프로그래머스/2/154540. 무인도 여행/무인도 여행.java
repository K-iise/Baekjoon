import java.util.*;

class Solution {
    boolean check[][];
    int n, m;
    List<Integer> ans = new ArrayList<>();
    
    public int[] solution(String[] maps) {
        n = maps.length; // 세로
        m = maps[0].length(); // 가로
        
        check = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check[i][j] || maps[i].charAt(j) == 'X') continue;
                DFS(j, i, maps);  // DFS 호출
            }
        }
        
        if (ans.isEmpty()) return new int[]{-1};
        return ans.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    
    public void DFS(int x, int y, String maps[]) {
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{x, y});
        check[y][x] = true;
        
        int ny[] = {-1, 1, 0, 0};
        int nx[] = {0, 0, -1, 1};
        int sum = 0;

        while (!que.isEmpty()) {
            int[] curr = que.poll();
            int cx = curr[0];
            int cy = curr[1];
            sum += maps[cy].charAt(cx) - '0';  // 현재 좌표 값 더하기
            
            for (int k = 0; k < 4; k++) {
                int ry = cy + ny[k];
                int rx = cx + nx[k];
                
                if (ry >= 0 && ry < n && rx >= 0 && rx < m) {  // 유효한 범위인지 확인
                    if (!check[ry][rx] && maps[ry].charAt(rx) != 'X') {
                        que.add(new int[]{rx, ry});
                        check[ry][rx] = true;
                    }
                }
            }
        }
        ans.add(sum);
    }
}
