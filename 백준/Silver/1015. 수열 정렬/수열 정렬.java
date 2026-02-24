import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A_array[] = new int[N];
        int B_array[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A_array[i] = Integer.parseInt(st.nextToken());
            B_array[i] = A_array[i];
        }
        Arrays.sort(A_array);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (B_array[i] == A_array[j]) {
                    A_array[j] = -1;
                    System.out.print(j + " ");
                    break;
                }
            }
        }

    }
}
