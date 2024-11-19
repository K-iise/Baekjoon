import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        int Xnum[] = new int[10];
        int Ynum[] = new int[10];
        ArrayList<Character> str = new ArrayList();
        for(int i = 0; i < X.length(); i++){
            int idx = X.charAt(i) - '0';
            Xnum[idx]++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            int idx = Y.charAt(i) - '0';
            Ynum[idx]++;
        }
        
        // 공통 숫자를 내림차순으로 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 9부터 0까지 내림차순으로 공통 숫자 추가
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(Xnum[i], Ynum[i]); // 최소값만큼 공통 숫자 추가
            for (int j = 0; j < count; j++) {
                sb.append(i); // 숫자를 추가
            }
        }

        // 결과 문자열로 변환
        String answer = sb.toString();

        // 특수 케이스 처리
        if (answer.isEmpty()) {
            return "-1"; // 공통 숫자가 없는 경우
        }
        if (answer.chars().allMatch(c -> c == '0')) {
            return "0"; // "0"만 반복되는 경우
        }
        
        return answer;

    }
}