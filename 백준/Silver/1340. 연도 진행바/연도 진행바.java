
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double minutes = 525600; // 1년의 총 분.
		
		HashMap<String, Integer> months = new HashMap<String, Integer>();
		
		months.put("January", 1);
		months.put("February", 2);
		months.put("March", 3);
		months.put("April", 4);
		months.put("May", 5);
		months.put("June", 6);
		months.put("July", 7);
		months.put("August", 8);
		months.put("September", 9);
		months.put("October", 10);
		months.put("November", 11);
		months.put("December", 12);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int mths[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int result = 0; // 현재 까지 지나온 분.
		
		String month = st.nextToken(); // 현재 월
		String day = st.nextToken().substring(0,2); // 현재 날짜.
		String year = st.nextToken(); // 현재 년도
		String time = st.nextToken(); // 현재 시간.
		
		int m = months.get(month);
		
		int y = Integer.parseInt(year);
		
		// 윤년 검사.
		if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			mths[2]+=1;
			minutes = 527040;
			
		}
		// 모든 달 더하기.
		for (int i = 0; i < m; i++) {
			result += mths[i];
		}
		
		result += Integer.parseInt(day) - 1;
		
		result *= 60 * 24; // 날짜를 분으로 변환
		
		String hour = time.substring(0,2);
		String minute = time.substring(3);
		result += Integer.parseInt(hour) * 60;

		result += Integer.parseInt(minute);

		double percent = (double) (result / minutes) * 100;
		
		bw.write(percent + "");
		bw.flush();
		
		
		
	}

}
