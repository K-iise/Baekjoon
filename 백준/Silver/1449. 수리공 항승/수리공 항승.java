import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int length = 0;
		int result = 0;
		
		int tmp[] =  new int[N];
		
		for(int i = 0; i < N; i++)
		{
			tmp[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(tmp);
		
		for(int i = 0; i < N; i++) {
			
			if (tmp[i] > length) {
                result++;
                length = tmp[i];

                length += M - 1;
            }
			
		}
		
		bw.write(result + " ");
		bw.flush();
		
	}
	
	
	
}

