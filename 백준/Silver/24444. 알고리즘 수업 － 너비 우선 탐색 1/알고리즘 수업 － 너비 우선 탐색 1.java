
import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] check;
    static int[] count;
    static int visitCount = 1;
    static Queue<Integer> que = new LinkedList<>(); 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        check = new boolean[N + 1];
        count = new int[N + 1];

        // 그래프 초기화 (ArrayList 사용)
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 정렬 (한 번만 수행)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        BFS(R);

        // 출력을 StringBuilder로 최적화
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(count[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static void BFS(int start) {
        check[start] = true;
        count[start] = visitCount++;

        que.add(start);

        while (!que.isEmpty()) {
            int node = que.poll();
            for (Integer neighbor : graph.get(node)) {
                if (!check[neighbor]) {
                    check[neighbor] = true;
                    count[neighbor] = visitCount++;
                    que.add(neighbor);
                }
            }
        }
    }
}
