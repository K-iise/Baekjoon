import java.util.*;

class Solution {
        static int min;
        static Map<Integer, Map<String, Integer>> table;
        public int solution(int[] picks, String[] minerals) {
            int answer = 0;
            min = Integer.MAX_VALUE;
            table = new LinkedHashMap<>();
            
            table.put(0, new LinkedHashMap<>(Map.of("diamond",1,  "iron",1, "stone",1)));
            table.put(1, new LinkedHashMap<>(Map.of("diamond",5,  "iron",1, "stone",1)));
            table.put(2, new LinkedHashMap<>(Map.of("diamond",25, "iron",5, "stone",1)));
            
            for(int i = 0; i < picks.length; i++) {
                int p = 0;
                if (picks[i] != 0){
                    picks[i]--;
                    int count = 0;
                    while (count != 5) {
                        String atr = minerals[count];
                        p += table.get(i).get(atr);
                        count++;
                    }
                    mine(p, picks, minerals, count);
                    picks[i]++;
                }
            }
            answer = min;
            return answer;
        }

        public void mine(int piro, int[] picks, String[] minerals, int count) {
            
            boolean noPick = true;
for (int i = 0; i < picks.length; i++) {
    if (picks[i] != 0) noPick = false;
}
            if (count == minerals.length || noPick) {
                min = Math.min(piro, min);
                return;
            }
            for (int i = 0; i < picks.length; i++) {
                int p = piro;
                if(picks[i] != 0) {
                    picks[i]--;
                    int vcount = count;
                    int c = 0;
                    while (c != 5 && vcount < minerals.length) {
                        String atr = minerals[vcount];
                        p += table.get(i).get(atr);
                        vcount++;
                        c++;
                    }
                    mine(p, picks, minerals, vcount);
                    picks[i]++;
                }
            }
        }
    }