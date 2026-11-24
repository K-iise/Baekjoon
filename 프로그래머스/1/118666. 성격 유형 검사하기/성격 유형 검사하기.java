import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> hint = new HashMap<>();
        hint.put("매우 비동의", 3);
        hint.put("비동의", 2);
        hint.put("약간 비동의", 1);
        hint.put("모르겠음", 0);
        hint.put("약간 동의", 1);
        hint.put("동의", 2);
        hint.put("매우 동의", 3);
        
        Map<Integer, String> choice = new HashMap<>();
        choice.put(1, "매우 비동의");
        choice.put(2, "비동의");
        choice.put(3, "약간 비동의");
        choice.put(4, "모르겠음");
        choice.put(5, "약간 동의");
        choice.put(6, "동의");
        choice.put(7, "매우 동의");
        
        Map<String, Integer> result = new HashMap<>();
        result.put("R", 0);
        result.put("T", 0);
        result.put("C", 0);
        result.put("F", 0);
        result.put("J", 0);
        result.put("M", 0);
        result.put("A", 0);
        result.put("N", 0);
        
        for(int i = 0;  i < survey.length; i++) {
            String ch = choice.get(choices[i]);
            int score = hint.get(ch);
            String monster;
            

            if(choices[i] < 4) {
                monster = survey[i].charAt(0) + "";
            } else {
                monster = survey[i].charAt(1) + "";
            }
            
            result.put(monster, result.get(monster) + score);
        }
        
        if(result.get("R") < result.get("T")) {
            answer += "T";
        } else {
            answer += "R";
        }
        
        if(result.get("C") < result.get("F")) {
            answer += "F";
        } else {
            answer += "C";
        }
        
        if(result.get("J") < result.get("M")) {
            answer += "M";
        } else {
            answer += "J";
        }
        
        if(result.get("A") < result.get("N")) {
            answer += "N";
        } else {
            answer += "A";
        }
        
        return answer;
    }
}