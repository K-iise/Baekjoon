import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> origin = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            origin.add(br.readLine());
        }

        List<String> increase = new ArrayList<>(origin);
        increase.sort(Comparator.naturalOrder());

        List<String> decrease = new ArrayList<>(origin);
        decrease.sort(Comparator.reverseOrder());

        boolean increaseFlag = true;
        boolean decreaseFlag = true;

        for (int i = 0; i < N; i++) {
            if (!origin.get(i).equals(increase.get(i))){
                increaseFlag = false;
            }
            if (!origin.get(i).equals(decrease.get(i))){
                decreaseFlag = false;
            }
        }

        if (!increaseFlag && !decreaseFlag){
            System.out.println("NEITHER");
        } else if (decreaseFlag){
            System.out.println("DECREASING");
        } else {
            System.out.println("INCREASING");
        }

    }
}
