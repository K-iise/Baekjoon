import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        char[][] window = new char[H][W];
        int [][] result = new int[H][W];

        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for (int j = 0; j < W; j++) {
                window[i][j] = tmp.charAt(j);
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {

                if (window[i][j] == 'c'){
                    result[i][j] = 0;
                    int count = 0;
                    for (int k = j+1; k < W; k++) {
                        result[i][k] = ++count;
                    }
                } else if(result[i][j] == 0) {
                    result[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
