// 개인정보는 유효기간 지나면 파기.
// 모든 달은 28일까지 있다고 가정.
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> r = new ArrayList<>();
        int todays = parse(today);
        
        Map<String, Integer> maps = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++) {
            String [] pits = terms[i].split(" ");
            maps.put(pits[0], Integer.parseInt(pits[1]));
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String[] pits = privacies[i].split(" ");
            int info = parse(pits[0]);
            int days = (maps.get(pits[1]) * 28);
            if(info + days <= todays)
                r.add(i+1);
        }
        int[] answer = new int[r.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = r.get(i);
        }
        return answer;
    }
    
    public int parse(String words) {
        String[] pits = words.split("\\."); // 이스케이프 문자
        int result = (Integer.parseInt(pits[0]) * 12 * 28);
        result += (Integer.parseInt(pits[1]) * 28);
        result += Integer.parseInt(pits[2]);
        return result;
    }
}