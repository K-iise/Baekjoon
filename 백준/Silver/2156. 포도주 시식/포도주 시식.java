import java.io.*;
import java.util.*;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int []grape =  new int[N];
        int []dp = new int[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            grape[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            System.out.println(grape[0]);
            return;
        }
        if (N == 2) {
            System.out.println(grape[0] + grape[1]);
            return;
        }

        dp[0] = grape[0];
        dp[1] = grape[0] + grape[1];
        dp[2] = Math.max(dp[1], Math.max(grape[0] + grape[2], grape[1] + grape[2]));

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + grape[i], dp[i-3] + grape[i-1] + grape[i]));
        }

        int max = Arrays.stream(dp).max().getAsInt();


        bw.write("" + max);
        bw.flush();



    }
}



