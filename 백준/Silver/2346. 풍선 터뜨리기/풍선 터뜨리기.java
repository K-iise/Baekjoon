import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int N;
		Deque<int[]> dequeint = new ArrayDeque<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		
		N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());


		for (int i = 0; i < N; i++) {
			int arr[] = {i+1, Integer.parseInt(st.nextToken())};
			dequeint.add(arr);
		}
		
		int tm[] = dequeint.poll();
		
		bw.write(tm[0] + " ");
		
		int t = tm[1];
		
		for (int i = 0; i < N-1; i++) {
			if(t > 0) {
				for(int j=1; j<t; j++) {
					dequeint.add(dequeint.poll());
				}
				tm = dequeint.poll();
				t = tm[1];
				bw.write(tm[0] + " ");
			}
			
			else {
				for(int j=1; j<-t; j++) {
					dequeint.addFirst(dequeint.pollLast());
				}
				tm = dequeint.pollLast();
				t = tm[1];
				bw.write(tm[0] + " ");
			}
			
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
