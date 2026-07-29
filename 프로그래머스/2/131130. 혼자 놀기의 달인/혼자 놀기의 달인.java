// 카드가 총 100장
// 8, 6, 3, 7, 2, 5, 1, 4
// 1, 2, 3 ,4, 5, 6, 7, 8

import java.util.*;

class Solution {
    static boolean[] visit;
    static int result;
    public int solution(int[] cards) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int n = cards.length;
        visit = new boolean[n];
        
        for(int i = 0; i < n; i++){
            result = 0;
            if(!visit[i]) {
                visit[i] = true;
                DFS(cards[i], 1, cards);    
            }
            // visit[i] = true;
            // DFS(cards[i], 1, cards);
            
            if(result > 0){
                list.add(result);    
            }
            
        }
        
        if(list.size() < 2) {
            return 0;
        } else {
            Collections.sort(list, Collections.reverseOrder());
            answer = list.get(0) * list.get(1);
        }
        
        return answer;
        
    }
    
    public void DFS(int i, int count, int[] cards) {
        if(visit[i-1]) {
            result = count;
            return;
        }
        
        visit[i-1] = true;
        DFS(cards[i-1], ++count, cards);
    }

}