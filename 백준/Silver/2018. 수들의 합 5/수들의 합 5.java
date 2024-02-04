import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		int i = 1;
		
		while(N >= i) {
			
			int sum = 0;
			
			for(int j = i; j <= N; j++) {
				sum += j;
				if(sum == N) {
					count++;
					break;
				}
				else if(sum > N) {
					break;
				}
			}
			
			i++;
		}
		
		bw.write(count + " ");
		bw.flush();
		
	
	}

}
