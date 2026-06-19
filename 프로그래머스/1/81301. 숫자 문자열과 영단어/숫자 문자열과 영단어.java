import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> maps = new HashMap<>();
        maps.put("zero", "0");
        maps.put("one", "1");
        maps.put("two", "2");
        maps.put("three", "3");
        maps.put("four", "4");
        maps.put("five", "5");
        maps.put("six", "6");
        maps.put("seven", "7");
        maps.put("eight", "8");
        maps.put("nine", "9");
        
        for(String num : maps.keySet()) {
            s = s.replace(num, maps.get(num));
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}