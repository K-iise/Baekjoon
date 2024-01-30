import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		people.put("ChongChong", 1);
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String people1 = st.nextToken();
			String people2 = st.nextToken();
			
			if(people.containsKey(people1)) {
				people.put(people2, 1);
			}
			else if(people.containsKey(people2)) {
				people.put(people1, 1);
			}
		}
		
		bw.write(people.size() + " ");
	
		bw.flush();
		bw.close();
		br.close();
	}

}
