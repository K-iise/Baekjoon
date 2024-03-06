import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int time[] = new int[N];
		int result = 0;
		int tmp = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time);
		
		for(int i = 0; i < N; i++) {
			tmp = tmp + time[i];
			result = result + tmp;
		}
		
		
		bw.write(result + " ");
		
		bw.flush();
		
	}
	
	
	
}

