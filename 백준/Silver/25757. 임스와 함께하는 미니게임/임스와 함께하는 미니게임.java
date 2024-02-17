import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		HashMap<String, Integer> game = new HashMap();
		
		HashMap<String, Integer> players = new HashMap();
		
		game.put("Y", 1);
		game.put("F", 2);
		game.put("O", 3);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int player = game.get(st.nextToken());
		
		for(int i = 0; i < N; i++)
			
		{
			String tmp = br.readLine();
			
			players.put(tmp, 0);
			
		}
		
		bw.write(players.size() / player + " ");
		
		bw.flush();
		
	}

}
