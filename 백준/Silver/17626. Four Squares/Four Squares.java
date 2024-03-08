import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 4;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <= 223; i++){
            for(int j = 0; j <= 223; j++){
                for(int k = 0; k <= 223; k++){
                    if(i*i + j*j + k*k == N){
                        int count = 0;

                        if(i > 0)
                            count++;
                        if(j > 0)
                            count++;
                        if(k > 0)
                            count++;

                        if(ans > count)
                            ans = count;

                    }

                }
            }

        }


        bw.write(ans + " ");
        bw.flush();
    }
}