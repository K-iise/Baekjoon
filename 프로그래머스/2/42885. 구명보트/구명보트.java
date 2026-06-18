import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        List<Integer> p = new ArrayList<>();
        for(int i = 0; i < people.length; i++) {
            p.add(people[i]);
        }
        Collections.sort(p);
        
        int right = p.size() - 1;
        int left = 0;
        
        while(right >= left) {
            if(p.get(right) + p.get(left) <= limit) {
                right--;
                left++;
                answer++;
            }
            else {
                right--;
                answer++;
            }
        }
        
    
        
        return answer;
    }
}