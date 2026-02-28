import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int step = 1;
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            String[] names = new String[N];
            HashMap<String, boolean[]> papers = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                names[i] = st.nextToken();
                boolean []check = new boolean[N-1];
                for (int j = 0; j < N-1; j++) {
                    String talk = st.nextToken();
                    if (talk.equals("P")){
                        check[j] = false;
                    } else check[j] = true;
                }
                papers.put(names[i], check);
            }

            if (step > 1) {
                bw.write("\n");
            }

            bw.write("Group " + step++ + "\n");

            boolean flag = true;
            for (int i = 0; i < N; i++) {

                String name = names[i];
                boolean[] check = papers.get(name);
                for (int j = 0; j < N-1; j++) {

                    if (check[j]){
                        int index = (i - (j + 1) + N) % N;
                        bw.write(names[index] + " was nasty about " + name + "\n");
                        flag = false;
                    }
                }
            }
            if (flag) bw.write("Nobody was nasty\n");
        }

        bw.flush();
    }
}
