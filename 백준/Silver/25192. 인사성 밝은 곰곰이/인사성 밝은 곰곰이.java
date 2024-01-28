import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, Integer> map = new HashMap();
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i< N; i++) {
			String tmp = br.readLine();
			
			if(tmp.equals("ENTER")) {
				result += map.size();
				 map = new HashMap();
			}
			else {
				map.put(tmp, 1);
			}
			
		}
		
		result += map.size();
		
		bw.write(result + " ");
		

		
		
	
		bw.flush();
		bw.close();
		br.close();
	}

}
