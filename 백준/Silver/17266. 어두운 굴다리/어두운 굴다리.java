

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 굴다리의 길이
		int M = Integer.parseInt(br.readLine()); // 가로등의 개수
		
		int position[] = new int[M];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 가로등의 위치 입력.
		for (int i = 0; i < position.length; i++) {
			position[i] = Integer.parseInt(st.nextToken());
		}
		
        // 가로등 사이의 최대 간격 찾기.
        int maxDistance = 0;
        
        // 시작 부분의 간격
        maxDistance = position[0];
        
        // 중간 부분의 최대 간격
        for (int i = 0; i < M - 1; i++) {
            int tmp = (position[i + 1] - position[i] + 1) / 2;
            if (maxDistance < tmp) {
                maxDistance = tmp;
            }
        }
        
        // 끝 부분의 간격
        int endDistance = N - position[M - 1];
        if (maxDistance < endDistance) {
            maxDistance = endDistance;
        }
        
        System.out.println(maxDistance);
		
	}
}
