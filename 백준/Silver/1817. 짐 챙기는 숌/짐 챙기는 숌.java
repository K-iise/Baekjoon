import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		if(N > 0) {
			st = new StringTokenizer(br.readLine());
			}
		
		int t = M;
		
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(tmp <= t) {
				if(t == M) {
					count++;
				}
				t -= tmp;
				
			}
			else {
				count++;
				t = M;
				t -= tmp;
			}
			
		}
		
		bw.write(count + " ");
		
		bw.flush();
		
	
	}

}
