class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        
        while(n >= num)
        {
            int sum = 0;
            
            for(int i = num; i <= n; i++){
                if(sum + i > n)
                    break;
                else
                    sum += i;
            }
            
            if(sum == n){
                answer++;
            }
            
            num++;
            
        }
        
        return answer;
        
        
    }
}