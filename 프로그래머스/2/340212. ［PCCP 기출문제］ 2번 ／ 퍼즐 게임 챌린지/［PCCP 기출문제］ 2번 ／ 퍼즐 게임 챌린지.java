import java.util.Arrays;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int max = 1; 
        int min = 1000000;
        int time_prev = 0;
        
        while(max <= min){  
            answer = (max + min) / 2;
            long timelimits = 0;
            for (int i = 0; i < diffs.length; i++){
                if(answer >= diffs[i]){
                    timelimits += times[i];
                }
                else timelimits += (long)(times[i] + times[i-1])* (long)(diffs[i] - answer) + times[i];
                
            }
            
            if(timelimits > limit){
                max = answer  + 1;
            }
            else 
                min = answer - 1;
        }
        
        return max;
    }
}