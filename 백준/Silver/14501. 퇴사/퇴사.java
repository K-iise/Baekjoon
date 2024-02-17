import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int max = 0;
		
		int T[] = new int[N];
		int P[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());	
		}
		
		int[] dp = new int[N+1];
		
		for(int i=0; i<N; i++) {
			 if(i+T[i] <= N) {	//범위에 벗어나지 않는다면 
				 dp[i+T[i]]=Math.max(dp[i+T[i]],dp[i]+P[i]);	
			 }//if
			 dp[i+1]=Math.max(dp[i+1],dp[i]);
			 
		}
		bw.write(dp[N] + " ");
		
		bw.flush();
		
	}

}
