import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 버퍼 생성.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 문자열 S 입력 받기.
		String S = br.readLine(); 
		
		// 문자열 S를 위한 스택 생성.
		Stack<Character> Stk = new Stack<Character>();
		
		int sum = 0, max = 0;
		
		for (int i = 0; i < S.length(); i++) {
			
			// 문자열의 index가 여는 괄호이면 스택에 괄호 추가.
			if(S.charAt(i) ==  '(' || S.charAt(i) == '{' || S.charAt(i) == '[') {
				
				Stk.push(S.charAt(i));
				
				char Brace = S.charAt(i);
				
				// 각 괄호별 포인트 추가.
				int point = 0;
				
				if(Brace == '(') point = 1;
				else if(Brace == '{') point = 2;
				else if(Brace == '[') point = 3;
				
				sum += point;
				
			}
			
			// 문자열의 index가 숫자라면 스택에 숫자 추가.
			else if(S.charAt(i) - '0' >= 0 && S.charAt(i) - '9' <= 9) {
				Stk.push(S.charAt(i));
				
				if(sum > max) {
					max = sum;
				}
			}
			
			// 문자열의 index가 닫는 괄호이면 스택에서 그 괄호와 숫자를 제거.
			else if(S.charAt(i) ==  ')' || S.charAt(i) == '}' || S.charAt(i) == ']') {
				ArrayList<Character> nlist = new ArrayList<Character>();
				
 				// 여는 괄호가 나올 때 까지 반복.
				while(!(Stk.peek() ==  '(' || Stk.peek() == '{' || Stk.peek() == '[')) {
					nlist.add(Stk.pop());
				}
				
				// 여는 괄호 확인.
				char Brace = Stk.pop();
				
				// 각 괄호별 포인트 추가.
				int point = 0;
				
				if(Brace == '(') point = -1;
				else if(Brace == '{') point = -2;
				else if(Brace == '[') point = -3;
				
				// 스택에서 제거한 숫자를 다시 추가.
				while(!nlist.isEmpty()) {
					Stk.push(nlist.remove(0));
				}
				
				sum += point;
			}
		}
		
		bw.write(max + "");
		bw.flush();
	}

}
