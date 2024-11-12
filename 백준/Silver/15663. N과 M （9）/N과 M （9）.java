import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int num[];
	static boolean check[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		num = new int[N];
		check = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			num[i] = tmp;
		}
		
		Arrays.sort(num);
		
		NandM(0, "");
	}
	
	public static void NandM(int count, String str) {
		if(count == M ) {
			System.out.println(str);
			return;
		}
		
		int xx = 0;
		
		for (int i = 0; i < N; i++) {
			if(!check[i] && xx != num[i]) {
				check[i] = true;
				xx = num[i];
				String tmp = str + num[i] + " ";
				NandM(count+1, tmp);
				check[i] = false;
			}
		}
			
	}

}
