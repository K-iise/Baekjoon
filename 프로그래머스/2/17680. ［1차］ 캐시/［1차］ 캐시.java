import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int LRU = 0;
        
        cities = Arrays.stream(cities).map(String::toLowerCase).toArray(String[]::new);
        
        Map<String, Integer> cache = new HashMap<>();
        
        for(String city : cities){
            if(cache.size() < cacheSize && !cache.containsKey(city)){
                cache.put(city, LRU++);
                answer += 5; // cache miss
            }
            else if(cache.containsKey(city)){
                answer += 1; // cache hit;
                cache.replace(city, LRU++);
            }
            else if(cache.size() == cacheSize) {
                
                if(cache.size() == 0){
                    answer += 5; // cache miss
                }
                else{
                ArrayList<Integer> alist = new ArrayList<>(cache.values());
                Collections.sort(alist);
                
                int l = alist.get(0); // value 얻기.
                cache.values().remove(l);
                cache.put(city, LRU++);
                answer += 5; // cache miss
                }
            }
        }
        
        return answer;
    }
}