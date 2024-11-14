

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Position{
	public int h;
	public int n;
	public int m;
	
    public Position(int h, int n, int m) {
        this.h = h;
        this.n = n;
        this.m = m;
    }

    public Position hadd(int dh) {
        return new Position(this.h + dh, this.n, this.m);
    }
    
    public Position nadd(int dn) {
        return new Position(this.h, this.n + dn, this.m);
    }
    
    public Position madd(int dm) {
        return new Position(this.h, this.n, this.m + dm);
    }
	

}

public class Main {
	
	static int tomato[][][];
	static boolean check[][][];
    static int days = 0; // 날짜.
    static int[] dh = {1, -1, 0, 0, 0, 0}; // 상자 높이 이동
    static int[] dn = {0, 0, 1, -1, 0, 0}; // 행 이동
    static int[] dm = {0, 0, 0, 0, 1, -1}; // 열 이동
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken()); // 가로
		int N = Integer.parseInt(st.nextToken()); // 세로
		int H = Integer.parseInt(st.nextToken()); // 상자 수
		
		tomato = new int[H][N][M];
		check = new boolean[H][N][M];
		
		Queue<Position> que = new LinkedList<Position>();
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < M; j2++) {
					tomato[i][j][j2] = Integer.parseInt(st.nextToken());
					if(tomato[i][j][j2] == 1) {
						que.add(new Position(i, j, j2));
						check[i][j][j2] = true;
					}
				}
			}
		}
		
		BFS(que, H, N, M);
		
        // 모든 토마토가 익었는지 확인
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomato[i][j][k] == 0) { // 익지 않은 토마토가 있다면
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        
        System.out.println(days);
		
	}
	
	public static void BFS(Queue<Position>que, int H, int N, int M) {
		while(!que.isEmpty()) {
			int size = que.size();
			boolean progressed = false;
			
			for (int i = 0; i < size; i++) {
				Position pos = que.poll();
				
				for (int j = 0; j < 6; j++) {
					int nh = pos.h + dh[j];
					int nn = pos.n + dn[j];
					int nm = pos.m + dm[j];
					
					if(nh >= 0 && nh < H && nn >=0 && nn < N && nm >= 0 && nm < M) {
						if (!check[nh][nn][nm] && tomato[nh][nn][nm] == 0) {
                            check[nh][nn][nm] = true;
                            tomato[nh][nn][nm] = 1;
                            que.add(new Position(nh, nn, nm));
                            progressed = true;
                        }
					}
				}
				
			}
			
			if (progressed) days++;
		}
	}

}
