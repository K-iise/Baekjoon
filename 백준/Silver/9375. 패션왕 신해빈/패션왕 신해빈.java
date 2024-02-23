import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int result;
		ArrayList<Integer> decimal = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			int T = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			
			for(int j = 0; j < T; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			
			result = 1;
			
			for(int val: map.values()) {
				result *= (val+1);
			}
			bw.write(result-1 + "\n");
		}
		
		
		bw.flush();
		
		
	}

}
