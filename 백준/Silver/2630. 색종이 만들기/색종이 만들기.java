
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static LinkedList<LinkedList<Integer>> arr = new LinkedList<>();
	static int whitecount = 0;
	static int bluecount = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 초기화
		for (int i = 0; i < N; i++) {
			arr.add(new LinkedList<Integer>());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				arr.get(i).add(Integer.parseInt(st.nextToken()));
			}
			
		}
		
		colorpaper(0,0,N,N);
		
		System.out.print(whitecount + "\n" + bluecount);
		
	}
	// 0 0 8 8
	public static void colorpaper(int n, int m, int nx, int ny) {
		int sum = 0;
		int c = (nx - n) * (ny - m);  // 전체 요소 개수
		
		for (int i = n; i < nx; i++) {
			for (int j = m; j < ny; j++) {
				sum += arr.get(i).get(j);
			}
		}
		
		if(sum == c ) {
			bluecount++;
		}
		else if(sum == 0) {
			whitecount++;
		}
		
		else {
	        int midX = (n + nx) / 2;
	        int midY = (m + ny) / 2;
	        
	        // 사분할
	        colorpaper(n, m, midX, midY);         // 왼쪽 위
	        colorpaper(midX, midY, nx, ny);       // 오른쪽 아래
	        colorpaper(midX, m, nx, midY);        // 왼쪽 아래
	        colorpaper(n, midY, midX, ny);        // 오른쪽 위
		}
	}

}
