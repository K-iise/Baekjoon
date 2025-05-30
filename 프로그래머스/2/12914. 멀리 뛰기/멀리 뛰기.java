class Solution {
    public long solution(int n) {
        long answer = 0;
        
        Long dp[] = new Long[n+1];
        dp[0] = 1L;
        dp[1] = 1L;
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        answer = dp[n];
        return answer;
    }
}