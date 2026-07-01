import java.util.*;

class Solution {
    
    static List<List<Integer>> result = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        int [][]answer = new int[result.size()][2];
        
        for(int i = 0; i < result.size(); i++) {
            for(int j = 0; j < 2; j++) {
                answer[i][j] = result.get(i).get(j);
            }
        }
        return answer;
    }
    
    public void hanoi(int n, int start, int end, int sub) {
        if(n == 1){
            move(1, start, end);
            return;
        }
        
        else {
            hanoi(n-1, start, sub, end);
            move(n, start, end);
            hanoi(n-1, sub, end, start);
        }
    }
    
    public void move(int n, int start, int end) {
        result.add(List.of(start, end));
    }
}