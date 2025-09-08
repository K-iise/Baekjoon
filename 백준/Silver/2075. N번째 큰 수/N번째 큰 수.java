import java.io.*;
import java.util.*;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                pq.add(tmp);
            }
        }

        for (int i = 1; i < N; i++) {
            pq.poll();
        }

        bw.write(pq.peek() + "");
        bw.flush();



    }
}



