import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static boolean []visit;
    static int [][]computer;
    static int count = 0;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        computer = new int[N+1][N+1];
        visit = new boolean[N+1];


        for(int i = 0; i < M; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            computer[first][second] = computer[second][first] = 1;

        }

        count = dfs(1);

        bw.write(count + "");
        bw.flush();
    }

    public static int dfs(int i) {
        visit[i] = true;

        for(int j=1; j<=N; j++) {
            if(computer[i][j] == 1 && !visit[j]) {
                count ++;
                dfs(j);
            }
        }
        return count;
    }
}