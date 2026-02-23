import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int purse = Integer.parseInt(br.readLine());

        int cnt = 0;
        int repeat = 2;
        int count = -1;

        while (cnt < T) {
            List<Integer> pupa = new ArrayList<>(List.of(0,1,0,1));

            for (int i = 0; i < repeat; i++) {
                pupa.add(0);
            }
            for (int i = 0; i < repeat; i++) {
                pupa.add(1);
            }

            for (Integer p : pupa) {
                if (p == purse) {
                    cnt++;
                }
                count++;

                if (cnt == T)
                    break;
            }
            repeat++;
        }

        System.out.println(count % people);
    }
}
