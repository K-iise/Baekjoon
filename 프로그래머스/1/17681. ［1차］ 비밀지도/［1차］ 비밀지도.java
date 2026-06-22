class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            int tmp = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(tmp);
            str = String.format("%"+n+ "s", str);
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            answer[i] = str;
        }
        return answer;
    }
}