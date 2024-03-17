import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [][]mine = new int[N][M];

        int min = 256;
        int max = 0;
        for(int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                mine[i][j] = Integer.parseInt(st.nextToken());

                if(min > mine[i][j]) min = mine[i][j];

                if(max < mine[i][j]) max = mine[i][j];
            }
        }

        int time = 999999999;
        int high = 0;
        for(int i = min; i <= max; i++){
            int count = 0;
            int block = K;

            for(int j = 0; j < N; j++){
                for(int t = 0; t < M; t++){
                    if(i < mine[j][t]){
                        count += ((mine[j][t] - i) * 2);
                        block += (mine[j][t] - i);
                    }
                    else {
                        count += (i - mine[j][t]);
                        block -= (i - mine[j][t]);
                    }
                }
            }

            if(block < 0) break;

            if(time >= count){
                time = count;
                high = i;
            }
        }

        bw.write(time + " " + high);
        bw.flush();
    }


}