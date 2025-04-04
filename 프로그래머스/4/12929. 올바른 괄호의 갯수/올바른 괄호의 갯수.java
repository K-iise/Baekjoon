class Solution {
    public int solution(int n) {
        int answer = 0;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        
        answer = dp[n];
        return answer;
    }
}