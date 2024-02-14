import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		int picture[][] = new int[101][101];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int ax = Integer.parseInt(st.nextToken());
			int ay = Integer.parseInt(st.nextToken());
			int bx = Integer.parseInt(st.nextToken());
			int by = Integer.parseInt(st.nextToken());
			
			for(int j = ax; j <= bx; j++) {
				for(int k = ay; k <= by; k++) {
					picture[k][j]++;
				}
			}
			
		}
		
		for(int i = 1; i<=100; i++) {
			for(int j = 1; j<=100; j++) {
				if(picture[j][i] > M) {
					count++;
				}
			}
		}
		
		bw.write(count + " ");
		
		bw.flush();
		
	}

}
