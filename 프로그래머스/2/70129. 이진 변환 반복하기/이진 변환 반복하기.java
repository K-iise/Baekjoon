class Solution {
    public int[] solution(String s) {
        int zeroCount = 0, BinaryCount = 0;
        String tmpStr = s;
        boolean flag = false;
        while(!flag){
            int idx = 0; // 0을 제거한 후 길이
            
            // 2진수로 변환한 값에 대해서 검사.
            for(int i = 0; i < tmpStr.length(); i++){
                if(tmpStr.charAt(i) == '0'){ // 0이 존재하는지 검사.
                    flag = false;
                    zeroCount++;
                }
                else{
                    idx++;
                }
            }
            
            if(tmpStr.length() == 1)
                flag = true;
            else{
                tmpStr = Integer.toBinaryString(idx); // 2진변환
                BinaryCount++;
            }
        }
        int[] answer = { BinaryCount, zeroCount };
        
        return answer;
    }
}