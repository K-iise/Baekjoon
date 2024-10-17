
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		ArrayList<String> words = new ArrayList<String>();
		
		for (int i = 1; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length(); j++) {
				
				
				/*  substring(first, last)는
					first는 포함 last는 불포함.
					예를들어 substring(0, 3)이면
					0~2번째 index까지 가져오는 것. 즉 0 1 2 까지. 3은 포함 X
				*/
				String str1 = reverse(str.substring(0, i));
				String str2 = reverse(str.substring(i, j));
				String str3 = reverse(str.substring(j));
				
				String result = str1 + str2 + str3;
				
				words.add(result);
			}
			
		}
		
		Collections.sort(words); // 오름차순으로 정렬
		
		
		System.out.print(words.get(0)); // 제일 작은 단어(사전 순 맨 앞) 단어 출력

	}
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
	
	}

}
