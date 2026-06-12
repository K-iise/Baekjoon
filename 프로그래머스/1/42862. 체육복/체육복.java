import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean people[] = new boolean[n+1];
        List<Integer> re = new ArrayList<>();
        
        for(int i=0; i < lost.length; i++) {
            int index = lost[i];
            people[index] = true;
            // 도난 당함
        }
        
        for(int i = 0; i < reserve.length; i++) {
            int index = reserve[i];
            
            // 여분의 체육복을 가지고 있는 사람이 도난 당함.
            if(people[index]) {
                people[index] = false;
            }
            else {
                re.add(index);
            }
        }
        
        Collections.sort(re);
        
        for(int i = 0; i < re.size(); i++) {
            int index = re.get(i);
            
            // 앞에 있는 사람 먼저 빌려줌.
            if(index > 1 && people[index-1]) {
                people[index-1] = false;
            }
            // 뒤에 있는 사람 후에 빌려줌.
            else if(index < n && people[index+1]) {
                people[index+1] = false;
            }
             
        }
        
        
        for(int i = 1; i <= n; i++) {
            if(!people[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}