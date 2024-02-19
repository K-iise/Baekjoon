import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int l[] = new int[N];
		int m[] = new int[N+1];
		
		int result = 0;
		
		for(int i=0; i<N-1; i++) {
			l[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			m[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(m[i] > m[i+1]) {
				result = result + (l[i] * m[i]);
			}
			
			else {
				result = result + (l[i] + l[i+1]) * m[i];
				i++;
			}
		}
        	
		System.out.println(result);
		
	}
}
	
	

