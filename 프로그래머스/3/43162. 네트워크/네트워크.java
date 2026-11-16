import java.util.*;
// 1 1 0 0 -> 1
// 1 1 0 1 -> 0
// 0 0 1 
// 본인은 1
class Solution {
    static boolean []flag;
    static int answer = 0;
    public int solution(int n, int[][] computers) {
        flag = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!flag[i]) {
                bfs(i, n, computers);
                answer++;
            }
        }

        return answer;
    }
    
    public void bfs(int k, int n, int[][] computers) {
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(k);
        
        while(!que.isEmpty()) {
            int t = que.poll();
            flag[t] = true;
            
            for(int i = 0; i < n; i++) {
                if(!flag[i] && computers[t][i] == 1) {
                    que.offer(i);
                }
            }
        }
    }
}