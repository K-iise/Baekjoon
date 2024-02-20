import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int N = sc.nextInt();
			
			int result = 0;
			
			for(int j = 0; j < N; j++) {
				int cx = sc.nextInt();
				int cy = sc.nextInt();
				int r = sc.nextInt();
				
				boolean Start = T(x1, y1, cx, cy, r);
				boolean End = T(x2, y2, cx, cy, r);
				
				if( !( Start && End ) && ( Start || End ) ) {
					result++;
				}
			}
			
			System.out.println(result);
		}

	}
	
	public static boolean T(int x, int y, int x1, int y1, int r) {
		if(Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2)) < r)
			return true;
		else
			return false;
	}
}
	
	

