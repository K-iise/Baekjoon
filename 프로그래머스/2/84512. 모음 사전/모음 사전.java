import java.util.*;

class Solution {
    public int solution(String word) {
        String gather = "AEIOU";
        int answer = 0;
        String result = "";
        
        while(!word.equals(result)){
            if(result.length() < 5) {
                result += "A";
            } else {
                while(result.charAt(result.length() - 1) == 'U'){
                    result = result.substring(0, result.length()-1);
                }
                char last = result.charAt(result.length() - 1);
                int index = gather.indexOf(last);
                result = result.substring(0, result.length() - 1) 
                    + gather.charAt(index+1);
            }
            answer++;
        }
        return answer;
    }
    
}