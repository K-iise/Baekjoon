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
		
		BigInteger bigNumber = BigInteger.valueOf(1);
		
		for(int i = 1; i <= M; i++) {
			BigInteger tmp2 = new BigInteger(Integer.toString(i));
			BigInteger tmp1 = new BigInteger(Integer.toString(N-i+1));
			bigNumber = bigNumber.multiply(tmp1);
			bigNumber = bigNumber.divide(tmp2);
		}
		
		bw.write(bigNumber + " ");
		bw.flush();
		
	}
	
	
	
}

