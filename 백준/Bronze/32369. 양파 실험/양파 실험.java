import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 진행되는 날짜
		int a = Integer.parseInt(st.nextToken()); // 칭찬하면 자라는 길이
		int b = Integer.parseInt(st.nextToken()); // 비난하면 자라는 길이
		
		int compliment = 1; // 칭찬양파
		int rebuke = 1; // 비난양파
		
		int sub = 0;
		
		// 날짜만큼 반복문
		while (n-- > 0) {
			compliment += a;
			rebuke += b;
			
			// 비난 양파가 더 크다면 바꿔준다.
			if (compliment < rebuke) {
				sub = compliment;
				compliment = rebuke;
				rebuke = sub;
			} else if (compliment == rebuke) { // 같다면 비난양파의 길이를 1만큼 감소시킨다.
				rebuke--;
			}
		}
		
		sb.append(compliment).append(" ").append(rebuke);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}