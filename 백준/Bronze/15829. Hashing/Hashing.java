import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long r = 31, M = 1234567891;
        BigInteger result = new BigInteger("0");

        int []alpha = new int[26];

        for(int i = 0; i < 26; i ++){
            alpha[i] = i+1;
        }

        for(int i = 0; i < N; i++){
            int tmp = alpha[str.charAt(i) - 'a'];
            BigInteger t = BigInteger.valueOf(tmp);
            BigInteger a = BigInteger.valueOf(1);

            for(int j = 0; j < i; j++){
                a = a.multiply(BigInteger.valueOf(r));
            }

            t = t.multiply(a);
            result = result.add(t);
        }

        result = result.remainder(BigInteger.valueOf(M));

        bw.write(result + "");
        bw.flush();
    }


}