import java.util.*;

 class Solution {
        static int min = Integer.MAX_VALUE;
        boolean visit[];
        public int solution(String begin, String target, String[] words) {
            int answer = 0;
            visit = new boolean[words.length];
            change(begin, target, words, 0);
            if (min != Integer.MAX_VALUE){
                answer = min;
            }
            return answer;
        }

        public void change(String begin, String target, String[] words, int count) {
            if(begin.equals(target)) {
                min = Math.min(count, min);
                return;
            }

            for(int i = 0; i < begin.length(); i++) {
                StringBuilder stringBuilder = new StringBuilder(begin);
                char start = 'a';
                char end = 'z';
                while (start <= end) {
                    stringBuilder.setCharAt(i, start);
                    for (int j = 0; j < words.length; j++) {
                        if (words[j].equals(stringBuilder.toString()) & !visit[j]) {
                            visit[j] = true;
                            change(stringBuilder.toString(), target, words, count + 1);
                            visit[j] = false;
                        }

                    }
                    start++;
                }
            }
        }
    }