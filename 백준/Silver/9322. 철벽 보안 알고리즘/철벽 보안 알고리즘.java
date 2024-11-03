

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		HashMap<String, Integer> key1 = new HashMap<String, Integer>();
		
		
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 T
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine()); // 한 문장의 단어 수.
			int index[] = new int[n];
			String words[] = new String[n];
			// 제 1 공개키 입력.
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				key1.put(st.nextToken(), j);
			}
			
			// 제 2 공개키 입력.
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				String tmp = st.nextToken();
				index[j] = key1.get(tmp);
			}
			
			// 암호문 입력
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				words[index[j]] = st.nextToken();
			}
			
			for (int j = 0; j < words.length; j++) {
				bw.write(words[j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
	}
}
