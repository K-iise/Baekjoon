import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int []numArr = new int[51];
        int maxResult = -1;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            numArr[number]++;
        }

        for (int i = 0; i < 51; i++) {
            if (i == numArr[i])
                maxResult = i;
        }
        bw.write(maxResult + "");
        bw.flush();
    }
}
