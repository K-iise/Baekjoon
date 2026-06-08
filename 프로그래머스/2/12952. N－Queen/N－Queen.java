class Solution {
    static boolean [] visit;
    static int []column;
    
    public int solution(int n) {
        int answer = 0;
        visit = new boolean[n];
        column = new int[n];
        answer += NQueen(0, n);
        return answer;
    }

    public int NQueen(int row, int n) {
        int count = 0;

        if (row == n) {
            return 1;
        }

        for(int i = 0; i < n; i++) {
            if (!visit[i] && check(row, i)) {
                visit[i] = true;
                column[row] = i;
                count += NQueen(row+1, n);
                visit[i] = false;
            }
        }
        return count;
    }
    public boolean check(int row, int z) {
        for (int i = 0; i < row; i++) {
            int col = column[i];
            if (Math.abs(col - z) == Math.abs(row - i)) {
                return false;
            }
        }
        return true;
    }
}