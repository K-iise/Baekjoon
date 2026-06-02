import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int select = nums.length / 2;
        
        
        Set<Integer> s = new HashSet();

        for(int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        if(s.size() > select) {
            return nums.length/2;
        }
        answer = s.size();
        return answer;
    }
}