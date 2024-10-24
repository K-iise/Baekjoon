

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static boolean check[];
	static int N, M;
	static int arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 1 ~ N까지 숫자.
		M = Integer.parseInt(st.nextToken()); // 길이가 M인 수열.
		
		check = new boolean[N+1];
		arr = new int[M];
		backtracking(1, 0);
		
	}
	
	public static void backtracking(int number, int depth) {
		
		if(M == depth) {
			for (int var : arr) {
				System.out.print(var + " ");
			}
			System.out.println();
			return;
		}

		for (int i = number; i <= N; i++) {
			if(!check[i]) {
				check[i] = true; // 방문.
				arr[depth] = i;
			
				backtracking(i + 1, depth+1);
				
				check[i] = false;
				
				
			}
		}
		return;
	}

}
