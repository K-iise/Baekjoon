import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long []number = new long[N];
        String tmp;

        for(int i = 0; i < N; i++){
            tmp = sc.next();
            number[i] = Long.parseLong(ptr(tmp));
        }
        Arrays.sort(number);

        for(int i = 0; i< N; i++){
            bw.write(number[i] + "\n");
        }

        bw.flush();
    }

    static String ptr(String str){
        StringBuilder tmp = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            tmp.append(str.charAt(i));
        }
        return tmp.toString();
    }

}