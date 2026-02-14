import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int size = number.length();
        int[] arrNum = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arrNum[i] = arrNum[i - 1] + (number.charAt(i - 1) - '0');
        }

        for (int i = (size % 2  == 0 ? size : size - 1); i >= 2; i-=2) {
            for (int j = 1; j <= size - i + 1; j++) {
                int middle = i / 2;
                int front = arrNum[j + middle - 1] - arrNum[j - 1];
                int back = arrNum[j + i - 1] - arrNum[middle + j - 1];

                if (front == back) {
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
