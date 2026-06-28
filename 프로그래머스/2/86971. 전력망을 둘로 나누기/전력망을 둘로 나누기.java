import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int skip = 0; skip < wires.length; skip++) {
            Map<Integer, List<Integer>> graph = new HashMap<>();    
            
            for(int i = 1; i <= n; i++) {
                graph.put(i, new ArrayList<>());
            }
            
            for(int j = 0; j < wires.length; j++) {
                if(skip == j) {
                    continue;
                }
                int v1 = wires[j][0];
                int v2 = wires[j][1];
                graph.get(v1).add(v2);
                graph.get(v2).add(v1);
            }
            
            boolean[] visit = new boolean[n + 1];
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(1);
            visit[1] = true;
            int visited = 1;
            
            while(!q.isEmpty()) {
                int cur = q.poll();
                for (int next : graph.get(cur)) {
                    if (!visit[next]) {
                        visit[next] = true;
                        visited++;
                        q.add(next);
                    }
                }
            }
            
            int other = n - visited;
            answer = Math.min(answer, Math.abs(visited - other));     
        }
        
        return answer;
    }
}