import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int day = 10;
        
        Map<String, Integer> maps = new LinkedHashMap<>();
        
        for(int i =0; i < want.length; i++) {
            maps.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length-day + 1; i++) {
            Map<String, Integer> copy = new LinkedHashMap<>();
            boolean flag = true;
            
            for(int j = i; j < day + i; j++) {
                String food = discount[j];
                if(maps.containsKey(food)) {
                    copy.put(food, copy.getOrDefault(food, 0) + 1);
                }
            }
            
            for(String food : maps.keySet()) {
                                int wantNumber = maps.get(food);
                int discountNumber = copy.getOrDefault(food, 0);
                
                if(discountNumber != wantNumber) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                answer++;
            }
        }
        
        return answer;
    }
}