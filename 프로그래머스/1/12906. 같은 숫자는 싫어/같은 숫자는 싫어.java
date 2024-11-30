import java.util.*;

public class Solution {
    public Object[] solution(int []arr) {
        Object[] answer = {};
        ArrayList<Integer> alist = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                alist.add(arr[i]);
            }
            else if(stack.peek() != arr[i]){
                stack.push(arr[i]);
                alist.add(arr[i]);
            }
        }
        
        answer = alist.toArray();

        return answer;
    }
}