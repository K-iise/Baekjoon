import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자료구조의 개수 N
		int N = Integer.parseInt(br.readLine());
		
		// 자료구죠들 큐는 0, 스택은 1
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int[] an = new int[tokenizer.countTokens()];
		int index = 0;
		while (tokenizer.hasMoreTokens()) {
		    an[index++] = Integer.parseInt(tokenizer.nextToken());
		}
		
		// 각 자료구조에 들어 있는 원소 넣기.
		Deque<Integer> deque = new ArrayDeque<>();
		
		// 원소들.
		tokenizer = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(tokenizer.nextToken());
		    if(an[i] == 0) {
				deque.add(tmp);
			}
		}
		
		// 삽입할 수열의 길이 M 
		int M = Integer.parseInt(br.readLine());
		
		// M의 수열 C
		tokenizer = new StringTokenizer(br.readLine());
		
		// 출력.
		
		for(int j = 0; j < M; j++) 
		{
			int tmp = Integer.parseInt(tokenizer.nextToken());
			deque.addFirst(tmp);
			tmp = deque.pollLast();
			bw.write(tmp + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
