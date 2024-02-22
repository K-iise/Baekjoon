import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int result;
		ArrayList<Integer> decimal = new ArrayList<>();
		
		for(int i = 2; i <= 10000; i++) {
			int j = 0;
			
			for(j = 2; j < i; j++) {
				if(i % j == 0)
					break;
			}
			
			if(i == j) {
				decimal.add(i);
			}
		}
		
		for(int i = 0; i < decimal.size(); i++) {
			result = decimal.get(i) * decimal.get(i+1);
			if(result > N)
			{
				System.out.print(result);
				break;
			}
				
				
		}
		
		
		
		bw.flush();
		
		
	}

}
