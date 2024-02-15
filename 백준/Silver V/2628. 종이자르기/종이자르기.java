import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		int picture[][] = new int[101][101];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int N = Integer.parseInt(br.readLine());
		
		int ax[] = new int[N+2];
		int ay[] = new int[N+2];
 		
		ax[0] = 0;
		ay[0] = 0;
		
		ax[N+1] = X;
		ay[N+1] = Y;
		
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int check = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			
			if(check == 0)
				ay[i] = P;
			else
				ax[i] = P; 
			
		}
		
		Arrays.sort(ax);
		Arrays.sort(ay);
		
		int amax = 0;
		int bmax = 0;
		
		for(int i=0; i<N+1; i++) {

			if(ax[i+1] - ax[i] > amax)
				amax = ax[i+1] - ax[i];
			
			if(ay[i+1] - ay[i] > bmax)
				bmax = ay[i+1] - ay[i];
		}
		
		
		bw.write(amax * bmax + " ");
		
		bw.flush();
		
	}

}
