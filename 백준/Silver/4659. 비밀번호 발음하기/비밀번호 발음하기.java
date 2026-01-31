import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("end")) break;

            if (check(str)) {
                System.out.printf("<%s> is acceptable.\n", str);
            }
            else
                System.out.printf("<%s> is not acceptable.\n", str);

        }
    }

    public static boolean check(String str) {
        boolean flag = false;
        List<String> gather = List.of("a","e","i","o","u");

        // 모음 하나를 반드시 포함해야 한다.
        for (String s : gather) {
            if (str.contains(s)) {
                flag = true;
                break;
            }
        }

        // 모음이 3개 혹은 자음이 3개 연속으로 오면 안된다.
        int con_seq = 0;
        int ga_seq = 0;
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.charAt(i) + "";

            // 모음 인 경우
            if (gather.contains(tmp)) {
                ga_seq++;
                con_seq = 0;
            }
            // 자음 인 경우
            else {
                con_seq++;
                ga_seq = 0;
            }

            if (con_seq == 3 || ga_seq == 3) {
                flag = false;
            }
        }

        // 같은 글자가 연속으로 오면 안된다. ee와 oo는 허용
        String substr = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            if (substr.equals(str.charAt(i) + "")) {
                if (!(str.charAt(i) == 'e' || str.charAt(i) == 'o'))
                    flag = false;
            }
            substr = str.charAt(i) + "";
        }

        return flag;

    }
}
