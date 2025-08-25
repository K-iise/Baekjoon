import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                int cpo1 = Math.abs(o1);
                int cpo2 = Math.abs(o2);

                if(cpo1 == cpo2){
                    return o1 - o2;
                }
                else {
                    return cpo1 - cpo2;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());

            if(tmp == 0){
                if(pq.isEmpty()){
                    bw.write("0\n");
                }
                else {
                    bw.write(pq.peek() + "\n");
                    pq.poll();
                }
            }
            else
                pq.add(tmp);
        }


        bw.flush();

    }
}