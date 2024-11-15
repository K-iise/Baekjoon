import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            
            if(tmp == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else{
                stack.push(tmp);
            }
        }
        
        answer = stack.isEmpty();


        return answer;
    }
}