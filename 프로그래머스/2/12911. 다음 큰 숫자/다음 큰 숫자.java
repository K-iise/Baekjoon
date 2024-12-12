class Solution {
    public int solution(int n) {
        int answer = n+1;
        String first = Integer.toBinaryString(n);
        int size = 0;
        
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) == '1'){
                size++;
            }
        }
        
        while(true){
            String tmp = Integer.toBinaryString(answer);
            int tsize = 0;
            
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) == '1'){
                    tsize++;
                }
            }
            
            if(tsize == size)
                break;
            else
                answer++;
        }
        
        return answer;
    }
}