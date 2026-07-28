import java.util.*;

class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean [][]visit;
    
    public int[] solution(String[] maps) {
        
        List<Integer> answer = new ArrayList<>();
        int n = maps.length;
        int m = maps[0].length();
        
        visit = new boolean[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                
                if(maps[i].charAt(j) != 'X' && !visit[i][j]) {               
                    int sum = 0;
                    Queue<int[]> q = new ArrayDeque<>();
                    q.offer(new int[]{i, j});
                    visit[i][j] = true;
                    
                    while(!q.isEmpty()) {
                        var t = q.poll();
                        
                        int x = t[0];
                        int y = t[1];
                        
                        sum += maps[x].charAt(y) - '0';
                        
                        for(int k = 0; k < 4; k++) {
                            
                            int px = x + dx[k];
                            int py = y + dy[k];
                            
                           if (px < 0 || px >= n || py < 0 || py >= m) {
                                continue;
                            }

                            if (maps[px].charAt(py) == 'X' || visit[px][py]) {
                                continue;
                            }
                            
                            visit[px][py] = true;
                            q.offer(new int[]{px, py});
                        }
                    }
                
                    answer.add(sum);
                }
            }
        }
        
        if(answer.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(answer);
        
        return answer.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}