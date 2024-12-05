import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> alist = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            int tmp = Integer.parseInt(st.nextToken());
            alist.add(tmp);
            System.out.println(tmp);
        }
        
        Collections.sort(alist);
        int last = alist.size() - 1;
        answer += alist.get(0) + " ";
        answer += alist.get(last);
        
        return answer;
    }
}