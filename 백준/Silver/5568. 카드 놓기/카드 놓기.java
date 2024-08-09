import java.io.*;
import java.util.*;


public class Main {

    static int number, choiceNum;
    static Set<String> set = new HashSet<String>();
    static boolean check[];
    static int[] list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        number = Integer.parseInt(br.readLine());
        choiceNum = Integer.parseInt(br.readLine());
        
        list = new int[number];
        check = new boolean[number];

        for (int i = 0; i < number; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        canMakeNum(0, "");

        bw.write(String.valueOf(set.size()));
        bw.flush();

    }

    public static void canMakeNum(int choiceIdx, String num){
        if (choiceIdx == choiceNum) {
            set.add(num);
            return;
        }

        for (int x = 0; x < number; x++) {
            if (!check[x]) {
                check[x] = true;
                canMakeNum(choiceIdx+1, num + list[x]);
                check[x] = false;
            }
        }
    }


}