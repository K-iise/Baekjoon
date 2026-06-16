import java.util.*;

 class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            List<String> hash = new LinkedList<>();

            if (cacheSize == 0) {
                answer = cities.length * 5;
                return answer;
            }

            for (String city : cities) {
                String lowerCity = city.toLowerCase(); // 소문자로 변경

                // 맵이 있으면 히트 시킨다.
                if (hash.contains(lowerCity)) {
                    answer += 1; // hit
                    hash.remove(lowerCity);
                    hash.add(lowerCity);
                }

                else {
                    // 캐시 사이즈가 다 찬 경우 LRU에 따라서 제거.
                    if (hash.size() == cacheSize) {
                        // 최소값이 제일 적게 사용한거니까?
                        hash.removeFirst();
                    }
                    answer += 5;
                    hash.add(lowerCity);
                }


            }
            return answer;
        }
    }