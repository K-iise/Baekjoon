import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        BigInteger dp[] = new BigInteger[N+1];

        if(N== 0){
            bw.write(0 + "");
        }
        else if(N==1){
            bw.write(1 +"");
        }
        else{
            dp[0] = new BigInteger("0");
            dp[1] = new BigInteger("1");

            for(int i = 2; i <= N; i++){
                dp[i] = dp[i-2].add(dp[i-1]);
            }
            bw.write(dp[N] + "");
        }

        bw.flush();
    }


}