import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		
		
		for(int i = 0; i< N-1; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(tmp > max)
				max = tmp;
			
			if(tmp < min)
				min = tmp;
			
		}
		
		bw.write(max * min + " ");
		
		
	
		bw.flush();
		bw.close();
		br.close();
	}

}
