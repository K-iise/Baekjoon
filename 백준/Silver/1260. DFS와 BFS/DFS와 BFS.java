

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static LinkedList<LinkedList<Integer>> graph = new LinkedList<LinkedList<Integer>>();
	static boolean check[];
	static boolean Dcheck[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		check = new boolean[N+1];
		Dcheck = new boolean[N+1];
		
		for (int i = 0; i <= N; i++) {
			graph.add(new LinkedList<Integer>());
		}
		
		for (int i = 0; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}

		DFS(V);
		System.out.println();
		BFS(V);
		
	}
	
	public static void DFS(int number) {
		Dcheck[number] = true;
		System.out.print(number + " ");
		
		for (Integer nodes : graph.get(number)) {
			if(!Dcheck[nodes]) {
				DFS(nodes);
			}
		}
	}
	
	
	public static void BFS(int number) {
		check[number] = true;
		System.out.print(number + " ");
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(number);
		
		while(!que.isEmpty()) {
			
			int q = que.poll();
			
			for (Integer integer : graph.get(q)) {
				if(!check[integer]) {
					check[integer] = true;
					System.out.print(integer + " ");
					que.add(integer);
				}
			}
		}
		
		System.out.println();
		
	}

}
