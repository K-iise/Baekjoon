import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N;
        int resultCount = 0;
        while (true) {
            N = Integer.parseInt(br.readLine());

            if (N == 0) break;

            HashMap<Integer, String> nameMap = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                String name = br.readLine();
                nameMap.put(i, name);
            }

            StringTokenizer st;
            HashMap<Integer, String> checkMap = new HashMap<>();
            for (int i = 1; i <= 2 * N - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int number = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if (checkMap.containsKey(number)) {
                    nameMap.remove(number);

                } else {
                    checkMap.put(number, name);
                }
            }

            for (String result : nameMap.values()) {
                resultCount++;
                bw.write(resultCount + " " + result + "\n");
            }
        }
        bw.flush();
    }
}
