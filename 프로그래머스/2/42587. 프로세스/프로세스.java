import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < priorities.length; i++) {
            map.put(i, priorities[i]);
            q.offer(i);
        }
        
        while(!q.isEmpty()) {
            var copy = map.values();
            int max = Collections.max(copy);
            var index = q.poll();
            
            if(map.get(index) == max) {
                answer++;
                map.remove(index);
                
                if(index == location) {
                    break;
                }
            } 
            else {
                q.offer(index);
            }
            
            
        }
        return answer;
    }
}