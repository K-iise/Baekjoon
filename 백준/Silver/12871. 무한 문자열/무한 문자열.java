import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
        String t = br.readLine();
        String S = s;
        String T = t;

        if (s.length() != t.length()) {

            int len = lcd(s.length(), t.length());

            while (S.length() != len) {
                S += s;
            }

            while (T.length() != len) {
                T += t;
            }
        }

        if (S.equals(T))
            System.out.println(1);
        else
            System.out.println(0);
        
		bw.flush();
		
	}
	
	private static int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        int tmp;
        while (b > 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
	
}

