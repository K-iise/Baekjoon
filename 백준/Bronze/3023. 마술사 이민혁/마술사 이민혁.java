import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String tmp;
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char [][]card = new char[R*2 + 1][C*2 + 1]; // 2R행, 2C열

        for (int i = 1; i <= R; i++) {
            tmp = br.readLine();
            for (int j = 1; j <= C; j++) {
                char ch = tmp.charAt(j-1);
                card[i][j] = ch;
                card[(R*2) - i + 1][j] = ch;
                card[i][(C*2)-j + 1] = ch;
                card[(R*2) - i + 1][(C*2)-j + 1] = ch;
            }
        }
        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(card[A][B] == '#')
            card[A][B] = '.';
        else
            card[A][B] = '#';

        for (int i = 1; i <= R * 2; i++) {
            for (int j = 1; j <= C * 2; j++) {
                bw.write(card[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();



    }
}