import javax.xml.transform.Source;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 1;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            if (dp[i-1] == 0 || dp[i-3] == 0) {
                dp[i] = 1;
            }
            else dp[i] = 0;
        }

        if (dp[N] == 1)
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}
