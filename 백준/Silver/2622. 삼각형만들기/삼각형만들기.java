import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int r = 0;
		
		for(int a=1; a <= N; a++) {
			for(int b=a; b <= N-a; b++) {
				int c = N - a - b;
				
				if(b > c)
					break;
				if(a + b > c) {
					//System.out.println(a + " " + b + " " + c);
					r++;
				}
				
			}
		}
		
		System.out.print(r);
	}

}
