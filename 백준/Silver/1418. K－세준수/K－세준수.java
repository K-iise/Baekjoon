import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        List<Integer> primeNumber = new ArrayList<>();
        int count = 0;

        for (int i = 2; i <= K; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                }
            }

            if (flag)
                primeNumber.add(i);
        }

        for (int i = 1; i <= N; i++) {
            int tmp = i;
            for (int prime : primeNumber) {
                while (tmp % prime == 0) {
                    tmp /= prime;
                }
            }
            if (tmp == 1) count++;
        }

        System.out.println(count);
    }
}
