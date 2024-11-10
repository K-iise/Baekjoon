

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		NandM(N, 0, 0, "");
		
	}

	public static void NandM(int n, int before, int count, String str) {
		if(count == M) {
			System.out.println(str);
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			String tmp = str + i + " ";
			
			if(before <= i)
				NandM(n, i, count+1, tmp);
		}
	}
}
