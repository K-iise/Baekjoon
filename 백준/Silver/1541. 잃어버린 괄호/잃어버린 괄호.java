
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int sum = Integer.MAX_VALUE;
        // 뺄셈을 기준으로 문자열을 나눈다.
        String strs[] = str.split("-");
        
        // 이제 나눈 문자열들을 다시 덧셈을 기준으로 나눈다.
        for (int i = 0; i < strs.length; i++) {
        	
        	int tmp = 0;
        	
			String[] add = strs[i].split("\\+");
			
			// 덧셈으로 나눈 문자열들을 모두 더한다.
			for (int j = 0; j < add.length; j++) {
				tmp += Integer.parseInt(add[j]);
			}
			
			// sum이 아직 초기값 인경우.
			// 맨 첫번째 수.
			if(sum == Integer.MAX_VALUE) {
				sum = tmp;
			}
			else {
				sum -= tmp;
			}
			
		}
        
        System.out.println(sum);

    }
}
