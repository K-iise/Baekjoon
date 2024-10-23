
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;


class Node {
	int N;
	int M;
	
	public Node() {
		
	}
	
	public Node(int n, int m) {
		this.N = n;
		this.M = m;
	}
}
public class Main {

	static boolean[][] visited;
	static int[][] array;
	static Stack<Node> nod;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 게임 구역의 크기 N
		
		array = new int[N+1][N+1];
		visited = new boolean[N+1][N+1];
		nod = new Stack<Node>();
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; j <= N; j++) {
				array[i][j] = Integer.parseInt(st.nextToken()); // 게임판의 구역.
			}
		}
		
		Node first = new Node(1,1);
		
		DFS(first, N);
		
		if(visited[N][N]) 
			System.out.println("HaruHaru");
		else
			System.out.println("Hing");

	}
	
	public static void DFS(Node node, int N) {
		visited[node.N][node.M] = true; // 방문 표시.
		
		nod.push(node); // 방문한 노드를 스택에 저장.
		
		while(!nod.isEmpty()) {
			
			Node nd = nod.pop(); // 노드 정점을 가져온다.
			int jump = array[nd.N][nd.M]; // 점프 할 거리.
			
	        // 점프 거리가 0이면 더 이상 이동할 수 없다.
	        if (jump == 0) {
	            continue;
	        }
			
			// 방문하지 않은 인접 정점을 방문한 것으로 표시하고 스택에 푸시.
			// 쩰리’가 이동 가능한 방향은 오른쪽과 아래 뿐이다. 위쪽과 왼쪽으로는 이동할 수 없다.
			if(nd.M + jump <= N && !visited[nd.N][nd.M + jump]) { // 오른쪽 점프
	            Node nw = new Node(nd.N, nd.M + jump);
	            nod.push(nw);
	            visited[nw.N][nw.M] = true;
			}
			
	        // 아래로 점프할 수 있는지 확인
	        if (nd.N + jump <= N && !visited[nd.N + jump][nd.M]) {
	            Node nw = new Node(nd.N + jump, nd.M);
	            nod.push(nw);
	            visited[nw.N][nw.M] = true;
	        }
		}
		
	}

}