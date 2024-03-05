import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int coin[] = new int[N];
		int index = 0;
		int result = 0;
		
		for(int i = 0; i < N; i++)
		{
			coin[i] = Integer.parseInt(br.readLine());
			
			if(coin[i] <= K) {
				index = i;
			}
		}
		
		
		while(K != 0) {
			if(K >= coin[index]) {
				K = K - coin[index];
				result++;
			}
			else {
				index--;
			}
		}
		
		bw.write(result + " ");
		
		bw.flush();
		
	}
	
	
	
}

