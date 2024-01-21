import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String str = br.readLine();
		
		
		if(str.equals("SONGDO"))
			bw.write("HIGHSCHOOL");
		else if(str.equals("CODE"))
			bw.write("MASTER");
		else if(str.equals("2023"))
			bw.write("0611");
		else if(str.equals("ALGORITHM"))
			bw.write("CONTEST");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
