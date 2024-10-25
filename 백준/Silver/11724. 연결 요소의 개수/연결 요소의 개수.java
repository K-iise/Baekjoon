

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<ArrayList<Integer>> graph;
	static int count = 0;
	static boolean check[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 정점의 개수.
		int M = Integer.parseInt(st.nextToken()); // 간선의 개수.
		
		graph = new ArrayList<ArrayList<Integer>>();
		check = new boolean[N+1];
		
		// 정점 추가.
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		
		// 간선 추가.
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (int i = 0; i < N; i++) {
			if(check[i+1])
				continue;
			
			checkConnect(i+1);
			
			count++;
			
		}
		
		
		System.out.println(count);
		
	}
	
	public static void checkConnect(int n) {
		check[n] = true;
		
		for (Integer b : graph.get(n)) {
			if(!check[b]) {
				checkConnect(b);
				
			}
		}
		
	}

}
