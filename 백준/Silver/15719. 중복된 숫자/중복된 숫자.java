import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int []number = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
        {
            int tmp = Integer.parseInt(st.nextToken());

            number[tmp]++;

            if(number[tmp] > 1){
                result = tmp;
                break;
            }
        }

        bw.write(result + "");
        bw.flush();
    }



}