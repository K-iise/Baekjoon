import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<Character> que = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            que.add(s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
            
            if(i > 0){
                char tmp = que.poll();
                que.add(tmp);
            }
            
            if (isValid(que)) {
                answer++;
            }
            
        }
        
        return answer;
    }
    
    public boolean isValid(Queue<Character> que){
        Stack<Character> stack = new Stack<>();
        
        for(char ch : que){
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch); // 여는 괄호는 스택에 추가
            }
            else {
                if(stack.isEmpty()) return false;
                
                char tmp = stack.pop(); // 스택에서 괄호 꺼내기.
                
                if(!check(tmp, ch)){
                    return false;
                }
            }
        }
        
         return stack.isEmpty(); // 스택이 비어야 모든 괄호가 유효함
    }
    
    public boolean check(char top, char bottom){
        return (top == '(' && bottom == ')') ||
               (top == '[' && bottom == ']') ||
               (top == '{' && bottom == '}');
    }
}