class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 1;
        boolean flag = true;
        
        while(true){
            
            for(int i = 0; i < arr.length; i++){
                if(count % arr[i] == 0){
                    flag = false;
                }
                else{
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                answer = count;
                break;
            }
            
            count++;
        }
        
        return answer;
    }
}