import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        Integer []burger = new Integer[B];
        Integer []side = new Integer[C];
        Integer []drink = new Integer[D];

        int min = Math.min(B , Math.min(C, D));

        int result = 0;
        int calresult = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            burger[i] = Integer.parseInt(st.nextToken());
            result += burger[i];
        }
        Arrays.sort(burger, Collections.reverseOrder());

        for (int i = 0; i < B; i++) {
            if (i < min) {
                calresult += (int) (burger[i] * 0.9);
            }
            else calresult += burger[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <C; i++) {
            side[i] = Integer.parseInt(st.nextToken());
            result += side[i];
        }
        Arrays.sort(side, Collections.reverseOrder());

        for (int i = 0; i < C; i++) {
            if (i < min){
                calresult += (int) (side[i] * 0.9);
            }
            else calresult += side[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
            result += drink[i];
        }
        Arrays.sort(drink, Collections.reverseOrder());
        for (int i = 0; i < D; i++) {
            if (i < min) {
                calresult += (int) (drink[i] * 0.9);
            }
            else calresult += drink[i];
        }

        System.out.println(result);
        System.out.println(calresult);

    }
}
