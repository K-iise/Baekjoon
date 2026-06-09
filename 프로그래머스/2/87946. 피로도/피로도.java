class Solution {
        static int max = 0;
        static boolean []visit;
        public int solution(int k, int[][] dungeons) {
            int answer = -1;
            visit = new boolean[dungeons.length];
            for (int i = 0; i < dungeons.length; i++) {
                if (!visit[i] && k >= dungeons[i][0]) {
                    visit[i] = true;
                    k -= dungeons[i][1];
                    dfs(k, dungeons, 1);
                    visit[i] = false;
                    k += dungeons[i][1];
                }
            }
            answer = max;
            return answer;
        }

        public void dfs(int k, int [][] d, int count) {
            for (int i = 0; i < d.length; i++) {
                if (!visit[i] && k >= d[i][0]) {
                    visit[i] = true;
                    k -= d[i][1];
                    dfs(k, d, count + 1);
                    visit[i] = false;
                    k += d[i][1];
                }
            }
            max = Math.max(max, count);
        }
    }
