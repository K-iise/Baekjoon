
// 1, 2, 3, 4, 5, 6, 7, 8
//          A        B
// 1, 2, 3, 4
//    A  B   
// 1, 2
// A  B
import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(n > 1) {
            
            answer++;
            
            for(int i = 2; i <= n; i+=2) {
                if((i == a && i-1 == b) || (i - 1 == a && i == b)) {
                    return answer;
                }        
            }
            n /= 2;
            if(a % 2 != 0) {
                a = (a / 2) + 1;
            } else {
                a /= 2;
            }
            if(b % 2 != 0) {
                b = (b / 2) + 1;
            } else {
                b /= 2;
            }
        } 

    
        return answer;
    }
}