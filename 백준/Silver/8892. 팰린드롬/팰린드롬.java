import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int M = Integer.parseInt(br.readLine());
			String result = "";
			String str[] = new String[M];
			
			for(int j = 0; j < M; j++) {
				str[j] = br.readLine(); 
			}
			
			for(int j = 0; j < M; j++) {
				for(int k = j+1; k < M; k++) {
					String test1 = str[j] + str[k];
					String copy1 = "";
					
					String test2 = str[k] + str[j];
					String copy2 = "";
					
					
					for(int t = test1.length()-1; t >=0; t--) {
						copy1 += test1.charAt(t);
					}
					
					for(int t = test2.length()-1; t >=0; t--) {
						copy2 += test2.charAt(t);
					}
					
					if(test1.equals(copy1)) {
						result = test1;
					}
					
					if(test2.equals(copy2)) {
						result = test2;
					}
					
				}
			}
			
			if(result.equals("")) {
				bw.write(0 + "\n");
			}
			else
				bw.write(result + "\n");
		}
		
		
		bw.flush();
		
	}
	
	
	
}

