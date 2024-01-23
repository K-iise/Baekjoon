import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자료구조의 개수 N
		int N;
		
		N = Integer.parseInt(br.readLine());
		
		bw.write(N*(N-1) + " ");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
