import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(s.empty()) {
                s.push(arr[i]);
            }
            else if(!s.empty() && s.peek() != arr[i]) {
                list.add(s.pop());
                s.push(arr[i]);
            }
        }
        list.add(s.pop());
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}