import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean isNewWord = true; // 단어의 시작 여부를 추적

        for (char c : s.toCharArray()) {
            if (c == ' ') { // 공백은 그대로 추가하고, 다음 단어의 시작으로 설정
                answer.append(c);
                isNewWord = true;
            } else {
                if (isNewWord) { // 단어의 첫 문자 처리
                    answer.append(Character.toUpperCase(c));
                } else { // 단어의 나머지 문자 처리
                    answer.append(Character.toLowerCase(c));
                }
                isNewWord = false;
            }
        }

        return answer.toString();
    }
}