import java.io.*;
import java.util.*;

public class Main {

    static int []dx = new int[] {1, 0, -1, 0}; // 남쪽, 동쪽, 북쪽, 서쪽 순서
    static int []dy = new int[] {0, 1, 0, -1};
    static int N;
    static int M;

    static int[][] board1 = new int[10][10];
    static int[][] board2 = new int[10][10];
    static public void upd(int x, int y, int dir){

        dir %= 4;

        while (true) {
            x += dx[dir];
            y += dy[dir];
            if(x < 0 || x >= N || y < 0 || y >= M || board2[x][y] == 6){
                return;
            }
            if (board2[x][y] != 0) continue;
            board2[x][y] = 7;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int mn = 0;

        Vector<Pair> cctv = new Vector<>(); // cctv 좌표

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board1[i][j] = Integer.parseInt(st.nextToken());
                if (board1[i][j] != 0 && board1[i][j] != 6){
                    cctv.add(new Pair(i, j));
                }
                if (board1[i][j] == 0) mn++;
            }
        }



        for (int tmp = 0; tmp < (1<<(2*cctv.size())); tmp++){

            for(int i = 0; i < N; i++)
                for(int j = 0; j < M; j++)
                    board2[i][j] = board1[i][j];

            int brute = tmp;
            for (int j = 0; j < cctv.size(); j++) {
                int dir = brute % 4;
                brute /= 4;

                int x = cctv.get(j).getLeft();
                int y = cctv.get(j).getRight();

                if(board1[x][y] == 1){
                    upd(x, y, dir);
                }
                else if(board1[x][y] == 2){
                    upd(x,y,dir);
                    upd(x,y,dir+2);
                }
                else if(board1[x][y] == 3){
                    upd(x,y,dir);
                    upd(x,y,dir+1);
                }
                else if(board1[x][y] == 4){
                    upd(x,y,dir);
                    upd(x,y,dir+1);
                    upd(x,y,dir+2);
                }
                else{ // board1[x][y] == 5
                    upd(x,y,dir);
                    upd(x,y,dir+1);
                    upd(x,y,dir+2);
                    upd(x,y,dir+3);
                }
            }

            int val = 0;
            for(int i = 0; i < N; i++)
                for(int j = 0; j < M; j++)
                    if(board2[i][j]==0) val++;
            mn = Math.min(mn, val);
        }



        bw.write(mn + "");
        bw.flush();
    }
}

class Pair {
    int Left;
    int Right;

    public  Pair(int left, int right){
        this.Left = left;
        this.Right = right;
    }

    public int getLeft() {
        return Left;
    }

    public int getRight() {
        return Right;
    }
}

