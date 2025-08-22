import java.io.*;
import java.util.*;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int tmp = Integer.parseInt(st.nextToken());

            if(tmp == 0){
                if(pq.isEmpty()){
                    bw.write("0\n");
                }
                else{
                    bw.write(pq.peek() + "\n");
                    pq.poll();
                }
            }
            else {
                pq.add(tmp);
            }
        }

        bw.flush();



    }
}



