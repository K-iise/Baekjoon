import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int result = 1;
        meet[] times = new meet[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            times[i] = new meet(first, second);
        }

        Arrays.sort(times, new Comparator<meet>() {
            @Override
            public int compare(meet o1, meet o2) {

                // 끝나는 시간이 같다면 시작 시간이 빠른 순서로 정렬
                if(o1.getEnd() == o2.getEnd()){
                    return  Integer.compare(o1.getStart(), o2.getStart());
                }
                return Integer.compare(o1.getEnd(), o2.getEnd());
            }
        });

        int first = times[0].getEnd(); // 4 저장.

        for (int i = 1; i < N; i++) {


            if(times[i].getStart() >= first){ // 시작하는 시간이 4보다 크거나 같은 경우.
                result++;
                first = times[i].getEnd();
            }

        }

        bw.write(result + "");
        bw.flush();
    }
}

class meet {
    int start;
    int end;

    public meet(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
