// 0 시간에 코어 1, 2, 3번 들어가고
// 1 시간에 코어 1이 다시 작업,
// 2 시간에 코어 1, 2 다시 작업. 해서 마지막 코어 2
class Solution {
    public int solution(int n, int[] cores) {
        int answer = 0;        
        if(n <= cores.length) {
            return n;
        }
        
        int left = 0;
        int right = 500000000;
        int time = 0;
        while(left < right) {
            time = (left + right) / 2;
            long count = 0;
            
            for(int i = 0; i < cores.length; i++) {
                count += (time / cores[i]) + 1;
            }
            
            if(count >= n) {
                right = time;
            } 
            else {
                left = time + 1;
            }
        }
        left--;
        int count = 0;
                
        for(int i = 0; i < cores.length; i++) {
            count += (left / cores[i]) + 1;
        }
        int remain = n - count;
        left++;
        for(int i = 0; i < cores.length; i++) {
            if(left % cores[i] == 0) {
                --remain;
                
            }
            if(remain == 0)
                return i + 1;
        }
        return answer;
    }
}