import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = (int)((a * b) / c);
        int y = (int)((a / b) * c);
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);

		
	
	}

}
