

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static BufferedReader br;
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		backtracking(0,0,N,M);
		
		bw.flush();
		
	}
	
	public static void backtracking(int recent, int depth, int N, int M) throws IOException {
		if(M == depth) {
			for (int num : arr) {
				bw.write(num + " ");
			}
			bw.write("\n");
			return;
		}
		
		for (int i = recent; i < N; i++) {
			int count = 0;
			arr[depth] = i + 1;
			backtracking(count, depth+1, N, M);
		}
		
	}

}
