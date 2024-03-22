import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int index = -1;
        int count = 0;

        int min = Math.abs(A-B);

        int []Hz = new int[N];

        for(int i = 0; i < N; i++)
        {
            Hz[i] = Integer.parseInt(br.readLine());
            if(Math.abs(Hz[i] - B) < min){
                min = Math.abs(Hz[i] - B);
                index = i;
            }
        }

        if(index != -1){
            count++;
            count += Math.abs(Hz[index]-B);
        }
        else{
            count += Math.abs(A-B);
        }


        bw.write(count + "");

        bw.flush();
    }


}