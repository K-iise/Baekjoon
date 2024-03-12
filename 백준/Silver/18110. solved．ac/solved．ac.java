import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double l = N * 0.15;
        int k = (int) (l + 0.5);
        double count = 0;
        long []score  = new long[N];
        long result = 0;

        for(int i = 0; i < N; i++){
            score[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(score);

        for(int i = k; i < N-k; i++){
            result += score[i];
            count++;
        }

        count = result / count;

        result = (long) (count + 0.5);


        bw.write(result + "");

        bw.flush();
    }


}