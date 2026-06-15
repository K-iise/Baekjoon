class Solution {
    public String solution(String number, int k) {
        int range = number.length();
        int num = range - k;        // 가져갈 개수
        StringBuilder st = new StringBuilder();
        int start = 0;

        while (num > 0) {
            int end = range - num;  // 이번에 고를 수 있는 마지막 인덱스
            int max = -1, maxIdx = start;
            for (int j = start; j <= end; j++) {
                int tmp = number.charAt(j) - '0';
                if (tmp > max) {        // 더 큰 값 → 값과 '위치' 둘 다 갱신
                    max = tmp;
                    maxIdx = j;
                    if (max == 9) break;   // 9면 더 볼 것도 없음 (조기종료)
                }
            }
            st.append((char)(max + '0'));
            start = maxIdx + 1;     // 다음 탐색은 고른 위치 '다음'부터
            num--;
        }
        return st.toString();
    }
}