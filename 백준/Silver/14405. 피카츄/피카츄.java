import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []tokens = new String[]{"pi", "ka", "chu"};

        String str = br.readLine();

        for (String token : tokens) {
            str = str.replace(token, " ");
        }
        if (str.trim().isEmpty()) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
