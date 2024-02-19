import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long len[] = new long [N-1];
		long money[] = new long[N];
		
		long result = 0;
		
		for(int i=0; i<N-1; i++) {
			len[i] = sc.nextLong();
		}
		
		for(int i=0; i<N; i++) {
			money[i] = sc.nextLong();
		}
		
		long sum = 0;
		long minmoney = money[0];
		
		for(int i = 0; i<N-1; i++) {
			if(minmoney > money[i]) {
				minmoney = money[i];
			}
			
			sum += (minmoney * len[i]);
		}
        	
		System.out.println(sum);
		
	}
}
	
	

