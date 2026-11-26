// 해설진들은 자기 바로 앞 선수를 추월할 때 추월한 선수의 이름을 부른다.
// 1등 부터 현재 등수 순서대로 담긴 배열 players
// 해설진이 부른 이름을 담은 배열 callings
// 경주가 끝났을 때 선수들의 이름을 1등부터 순서대로.
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = Arrays.copyOf(players, players.length);
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int index = rank.get(callings[i]);
            String tmp = answer[index-1];
            
            rank.put(tmp, index);
            rank.put(callings[i], index-1);
            
            answer[index] = tmp;
            answer[index-1] = callings[i];
        }
        
        return answer;
    }
}