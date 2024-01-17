import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		int X, N;
		Deque<Integer> Dequeint = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if(command.equals("1")) {
				Dequeint.addFirst(Integer.parseInt(st.nextToken()));
			}
			else if(command.equals("2")) {
				Dequeint.addLast(Integer.parseInt(st.nextToken()));
			}
			else if(command.equals("3")) {
					if(Dequeint.isEmpty())
						bw.write(-1 + "\n");
					else {
						bw.write(Dequeint.removeFirst() + "\n");
					}
				}
			
			else if(command.equals("4")) {
				if(Dequeint.isEmpty())
					bw.write(-1 + "\n");
				else {
					bw.write(Dequeint.removeLast() + "\n");
				}
			}
			
			else if(command.equals("5")) {
				bw.write(Dequeint.size() + "\n");
			}
			
			else if(command.equals("6")) {
				if(Dequeint.isEmpty())
					bw.write(1 + "\n");
				else
					bw.write(0 + "\n");
			}
			
			else if(command.equals("7")) {
				if(Dequeint.isEmpty())
					bw.write(-1 + "\n");
				else
					bw.write(Dequeint.getFirst() + "\n");
			}
			else if(command.equals("8")) {
				if(Dequeint.isEmpty())
					bw.write(-1 + "\n");
				else
					bw.write(Dequeint.getLast() + "\n");
			}
		}
		bw.flush();
		bw.close();
        br.close();
	}

}
