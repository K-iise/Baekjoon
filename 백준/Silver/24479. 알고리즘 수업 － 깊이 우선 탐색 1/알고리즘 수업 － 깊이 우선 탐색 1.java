

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static boolean visit[];
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int order[]; // 각 정점의 방문 순서를 저장할 배열
    static int visitCount = 1; // 방문 순서를 기록하기 위한 카운터

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 정점의 수
		int M = Integer.parseInt(st.nextToken()); // 간선의 수
		int R = Integer.parseInt(st.nextToken()); // 시작 정점.
		
		for (int i = 0; i < N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		visit = new boolean[N+1];
		order = new int[N + 1]; // 방문 순서를 저장할 배열
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u); // 양방향 간선.
			
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));	
		}
		
		// DFS  탐색 시작
		DFS(R);
		
		// 방문하지 않은 노드들에 대해 0 출력.
		for (int i = 1; i < visit.length; i++) {
			if(!visit[i]) {
				System.out.println("0");
			}
			else {
                System.out.println(order[i]);
            }
		}
		
	}
	
	public static void DFS(int node) {
		visit[node] = true; // 방문.
		order[node] = visitCount++; // 방문 순서 기록.
		
		// 이웃 노드 탐색.
		for (int neighbor : graph.get(node)) {
			if(!visit[neighbor]) { // 방문하지 않았으면 재귀적으로 호출.
				DFS(neighbor);
			}

		}
	}
}
