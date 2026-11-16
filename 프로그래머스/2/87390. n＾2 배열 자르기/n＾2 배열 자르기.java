
// 1 2 3 4 5 6 1행에 1 1개 나오고 증가
// 2 2 3 4 5 6 2행에 2 2개 나오고 증가
// 3 3 3 4 5 6 3행에 3 3개 나오고 증가
// 4 4 4 4 5 6 4행에 4 4개 나오고 증가
// 5 5 5 5 5 6 5행에 5 5개 나오고 증가
// 6 6 6 6 6 6 6행에 6 6개 나오고 증가
// n행에 n n개 나오고 증가.
import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int count = (int) (right - left) + 1;
        int []answer = new int[count];
        int index = 0;
        
        while(left <= right) {
            int row = (int) (left / n) + 1; // n 행
            int colum = (int) (left % n) + 1; // 열
            
            int result = 0;
            
            if(colum <= row) {
                result = row;
            } else {
                result = colum;
            }
            
            answer[index++] = result;
            left++;
        }
        
        return answer;
    }
}