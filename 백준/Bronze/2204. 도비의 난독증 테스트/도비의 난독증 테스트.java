import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        do {
            n = Integer.parseInt(br.readLine());

            if(n == 0)
                break;
            Map<String, String> word = new LinkedHashMap<>();
            ArrayList<String> Keyset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String tmp = br.readLine();
                word.put(tmp.toLowerCase(), tmp);
                Keyset.add(tmp.toLowerCase());
            }

            Keyset.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

            bw.write(word.get(Keyset.get(0)) + "\n");

        } while(true);

        bw.flush();
    }


}
