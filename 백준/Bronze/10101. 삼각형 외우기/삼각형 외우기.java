import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> angle = new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		for (int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();
			angle.put(tmp, 1);
			result += tmp;
		}
		
		
		if(result != 180) {
			System.out.print("Error");
		}
		else if(angle.size()==3) {
			System.out.print("Scalene");
		}
		else if(angle.size()==2) {
			System.out.print("Isosceles");
		}
		else if(angle.size()==1) {
			System.out.print("Equilateral");
		}
		
		

		
	}

}
