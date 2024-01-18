import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int X, N;
		Stack<Integer> stackint = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int index = 1;
		int k = 0;

		N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		int[] tmp = new int[N];

		for (int i = 0; i < N; i++) {
			String command = st.nextToken();
			tmp[i] = Integer.parseInt(command);
		}

		
		for (int i = 0; i < N; i++) {

			if (!stackint.empty() && stackint.peek() == index) {
					stackint.pop();
					++index;
			}

			else if (k < N) {
				
				if(tmp[k] == index) {
				index++;
				k++;
				}
				
				else {
					stackint.push(tmp[k]);
					--i;
					++k;
				}
			}

			
		}
		
		if (stackint.empty())
			bw.write("Nice");
		else
			bw.write("Sad");

		bw.flush();
		bw.close();
		br.close();
	}

}
