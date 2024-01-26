import java.util.*;
import java.io.*;

public class Main {
	
	static char[] Array;
	
	public static void cant(int start, int range) {

		if(range <= 1)
			return;
		
		int temprange = range / 3;
		
		for(int i = start + temprange; i< start + temprange*2; i++) {
			Array[i] = ' ';
		}
		
		cant(start, temprange);
		cant(start+temprange*2, temprange);
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringBuilder st;
		String input = "";
		
		while((input = br.readLine()) != null && !input.isEmpty()) {
			
			int N = Integer.parseInt(input);
			
			st = new StringBuilder();
			
			int len = (int) Math.pow(3, N);
			
			Array = new char[len];
			
			Arrays.fill(Array, '-');
			
			cant(0, len);
			
			for(int i = 0; i < len; i++) {
				st.append(Array[i]);
			}

			bw.write(st + "\n");
		}
		
	
		bw.flush();
		bw.close();
		br.close();
	}

}
