class Solution {
    public int[] solution(int brown, int yellow) {
        int width = 0;
        int length = 0;
        while(true) {
            int outline = (width * 2) + ((length - 2) * 2);
            if(outline == brown) {
                if(width*length == brown+yellow)
                    break;
            }
            if(width == length) {
                width++;
                length = 0;
                continue;
            } else {
                length++;
            }
        }
        int []answer = new int[2];
        answer[0] = width;
        answer[1] = length;
        return answer;
    }
}