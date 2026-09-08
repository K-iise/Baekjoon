import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> words1 = new ArrayList<>();
        List<String> words2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length()-1; i++) {
            String word1 = str1.substring(i, i+2).toLowerCase();
            if(checkAlpa(word1, 0) && checkAlpa(word1, 1)) {
                words1.add(word1);
            }
        }
        
        for(int i = 0; i < str2.length()-1; i++) {
            String word2 = str2.substring(i, i+2).toLowerCase();
            if(checkAlpa(word2, 0) && checkAlpa(word2, 1)) {
                words2.add(word2);
            }
        }
        
        List<String> copy = new ArrayList<>(words2);
        
        double inter = 0;
        for(String word : words1) {
            if(copy.contains(word)) {
                inter++;
                copy.remove(word);
            }
        }
        double union = words1.size() + words2.size() - inter;
        
        if(inter == 0 && union == 0) {
            return 65536;
        }
        answer = (int) ((inter / union) * 65536.0);
        
        
        return answer;
    }
    boolean checkAlpa(String word, int index) {
        return word.charAt(index) >= 'a' && word.charAt(index) <= 'z';
    }
}