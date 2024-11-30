import java.util.*;

class Solution {
    public Object[] solution(int[] progresses, int[] speeds) {
        Object[] answer = {};
        Queue<Integer> que = new LinkedList<>();
        
        ArrayList<Integer> alist = new ArrayList<>();
        
        // 초기 작업 진도를 스택에 저장.
        for(int i = 0; i < progresses.length; i++){
            int remainday = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            que.add(remainday);
        }
        
        
        while(!que.isEmpty()){
            int count = 1;
            int day = que.poll();
            
            while (!que.isEmpty() && que.peek() <= day) {
                que.poll();  
                count++;  
            }
            alist.add(count);
        }
        
        answer = alist.toArray();
        
        return answer;
    }
}