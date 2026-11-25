import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int n = park[0].length();
        int m = park.length;
        int width = 0;
        int height = 0;
        
        Map<String, Integer> position = Map.of("W", -1, "E", 1, "N", -1, "S", 1);
        
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    width = j;
                    height = i;
                }
            }
        }
        
        
        for(int i = 0; i < routes.length; i++) {
            String []parts = routes[i].split(" ");
            String direction = parts[0];
            int move = Integer.parseInt(parts[1]);
            
            if(direction.equals("W") || direction.equals("E")) {
                int p = position.get(direction);
                int result = move;

                for(int step = 1; step <= move; step++) {
                    int w = step * p + width;
                    
                    if(w < 0 || w >= n || park[height].charAt(w) == 'X') 
                    {
                        break;
                    }
                    result--;
                }
                
                if(result == 0) {
                    width += (move * p);
                }
            }
            
            if(direction.equals("N") || direction.equals("S")) {
                int p = position.get(direction);
                int result = move;

                for(int step = 1; step <=move; step++) {
                    int h = step * p + height;
                    
                    if(h < 0 || h >= m || park[h].charAt(width) == 'X') {
                        break;
                    }
                    result--;
                }
                
                if(result == 0) {
                    height += (move * p);
                }
            }
            
        }
        
        
        
        return new int[]{height, width};
    }
}