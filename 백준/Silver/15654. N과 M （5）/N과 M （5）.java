

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static int numbers[];
	static boolean visited[];
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		numbers = new int[N];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		
		NandM(0, "");
	
	}
	
	public static void NandM(int count, String str) {
		if(count == M) {
			System.out.println(str);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			
			if(!visited[i])
			{
				visited[i] = true;
				String tmp =  str + numbers[i]+ " ";
				
				NandM(count+1, tmp);
				
				visited[i] = false;
			}

		}
	}

}