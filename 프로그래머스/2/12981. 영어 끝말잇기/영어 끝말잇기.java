import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0}; // 기본값 설정 (정상적인 경우)
        Set<String> w = new HashSet<>(); // 중복 검사용

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            
            // 단어가 이미 사용되었거나 끝말잇기 규칙을 위반한 경우
            if (w.contains(currentWord) || 
                (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != currentWord.charAt(0))) {
                int number = (i % n) + 1; // 몇 번째 사람인지 계산
                int time = (i / n) + 1; // 몇 번째 차례인지 계산
                answer[0] = number;
                answer[1] = time;
                break; // 반복 종료
            }

            w.add(currentWord); // 단어 저장
        }

        return answer;
    }
}