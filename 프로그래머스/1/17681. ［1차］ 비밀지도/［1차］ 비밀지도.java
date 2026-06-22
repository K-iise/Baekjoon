class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String result = "";
            String tmp = Integer.toBinaryString(arr1[i]);
            String tmp2 = Integer.toBinaryString(arr2[i]);
            
            tmp = String.format("%"+n+ "s", tmp).replaceAll(" ", "0");
            tmp2 = String.format("%"+n+ "s",tmp2).replaceAll(" ", "0");
            
            for(int j = 0; j < n; j++) {
                if(tmp.charAt(j) == '1' || tmp2.charAt(j) == '1') {
                    result += "#";
                }
                else {
                    result += " ";
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}