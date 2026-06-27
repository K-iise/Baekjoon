import java.util.*;

class Solution {
    // 
    // 전체 스테이지 개수 N
    // 게임을 이용하는 사용자(i)가 현재 멈춰있는 스테이지번호 stages[i]
    // 실패율이 놓은 스테이지 부터 내림차순으로 반환 answer
    // 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int userNumber = stages.length;
        
        Map<Integer, Double> rank = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            int reached = 0; // 도달한사람
            int nonclear = 0; // 실패한사람
            double failRate = 0.0;
            for(int j = 0; j < userNumber; j++) {
                if(stages[j] >= i) reached++;   // 도달한 사람
                if(stages[j] == i) nonclear++;  // 실패한 사람
            }
            if(reached != 0)
                failRate = (double) nonclear / (double) (reached);
            
            rank.put(i, failRate);
        }
        List<Integer> keySet = new ArrayList<>(rank.keySet());
        
        keySet.sort((o1, o2) -> {
            int cmp = rank.get(o2).compareTo(rank.get(o1)); 
            if (cmp == 0) {
                return o1.compareTo(o2); 
            }
            return cmp;
        });
        
        for(int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}