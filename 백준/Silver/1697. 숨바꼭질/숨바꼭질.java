
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static boolean check[] = new boolean[100001]; // 방문 여부를 저장하는 배열
	static int count[] = new int[100001]; // 핵심 : 각 위치까지의 최단 시간을 저장하는 배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력을 받아 수빈이의 위치(N)와 동생의 위치(K)를 저장.
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 수빈이의 위치.
		int K = Integer.parseInt(st.nextToken()); // 동생의 위치.
		
		// BFS 탐색 함수 호출.
		teleport(N, K);
		
		// 동생의 위치(K)까지의 최단 시간 출력.
		System.out.println(count[K] + "");
	}
	
	public static void teleport(int n, int k){
		check[n] = true; // 시작 정점(수빈이의 위치)를 방문 표시
		count[n] = 0; // 시작 정점의 카운트를 0으로 초기화
		
		
		Queue<Integer> que = new LinkedList<Integer>(); // 큐를 생성하여 BFS 수행
		que.add(n); // 시작 정점을 큐에 삽입.

		// 큐가 빌 때까지 반복하여 BFS 수행.
		while(!que.isEmpty()) {
			int tmp = que.poll(); // 큐에서 현재 위치를 꺼냄.
			
			// 현재 위치가 동생의 위치와 같다면 반복 종료.
			if(tmp == k)
				break;
			
			// 현재 위치에서 이동할 수 있는 세 가지 위치를 배열로 정의.
			int position[] = {tmp -1, tmp +1, tmp * 2}; 
			
			// 각 인접한 정점을 큐에 삽입.
			for(Integer pos : position) {
				// 위치가 유효하고 아직 방문하지 않은 경우에만 수행
				if(pos >= 0 && pos < 100001 && !check[pos]) {
					check[pos] = true; // 방문 표시
					count[pos] = count[tmp] + 1; // 이전 위치의 시간에 1을 더해 저장.
					que.add(pos); // 인접 위치를 큐에 추가.
				}
			}
			
			
			
		}
	}

}
