import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int DP[] = new int[11];
		DP[1] = 0; 
		DP[2] = 1;
		DP[3] = 3;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 4; i <= N; i++) {
			DP[i] = DP[i-1] + i - 1;
		
		}
		
		bw.write(DP[N] + " ");
		bw.flush();
		
	}
}

