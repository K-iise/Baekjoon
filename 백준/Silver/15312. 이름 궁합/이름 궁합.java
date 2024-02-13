import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int Arr[] = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		String name1 = br.readLine();
		String name2 = br.readLine();
		
		int dp[] = new int[name1.length() + name2.length()];
		
		for(int i=0; i< dp.length-1; i = i+2) {
			dp[i] = Arr[name1.charAt(i/2) - 65] ;
			dp[i+1] = Arr[name2.charAt(i/2) - 65];
			
		}
		
		int size = dp.length;
		
		while(size > 2)
		{
			for(int i=0; i< size-1; i++) {
				dp[i] = (dp[i] + dp[i+1]) % 10;
			}
			dp[--size] = 0;
		}
		
		bw.write(dp[0] + "" + dp[1] + " ");
		
		bw.flush();
		
	
	}

}
