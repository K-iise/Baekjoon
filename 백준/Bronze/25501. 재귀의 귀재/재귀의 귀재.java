import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int tmp = 0;
			int t = 1;
			String str = br.readLine();
			
			int l = 0;
			int r = str.length()-1;
			
			do {
				++tmp;
				
				if(str.charAt(l) != str.charAt(r)) {
					t = 0;
					break;
				}
				else if(l >= r) {
					t = 1;
					break;
				}
				l = l+1;
				r = r-1;
				
			} while(true);
			

			bw.write(t + " ");
			bw.write(tmp + "\n");
		}
		
        
		bw.flush();
		bw.close();
		br.close();
	}

}
