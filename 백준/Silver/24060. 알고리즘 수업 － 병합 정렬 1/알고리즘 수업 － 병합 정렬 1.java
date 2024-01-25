import java.util.*;
import java.io.*;

public class Main {
	
	static int[] tmp;
	static int count = 0;
	static int k , result = -1;
	public static void Merge_sort(int A[], int p, int r){
	    if (p < r){
	        int q = (p + r) / 2;       
	        Merge_sort(A, p, q);      
	        Merge_sort(A, q + 1, r);  
	        Merge(A, p, q, r);        
	    }
    }
    public static void Merge(int A[], int p, int q, int r){
    	 int i =  p; 
    	 int j = q + 1; 
    	 int t = 0;
    	 
    	    while (i <= q && j <= r) {
    	        if (A[i] <= A[j])
    	        	tmp[t++] = A[i++]; 
    	        else 
    	        	tmp[t++] = A[j++]; 
    	    }
    	    while (i <= q) {
    	        tmp[t++] = A[i++];
    	        }
    	    while (j <= r) { 
    	        tmp[t++] = A[j++];
    	    }
    	    
    	    i = p; 
    	    t = 0;
    	    
    	    while (i <= r)  {
    	        A[i++] = tmp[t++];
    	        count++;
    	        if(count == k) {
    	        	result = tmp[t-1];
    	        	break;
    	        }
    	    }
    }
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		k = Integer.parseInt(st.nextToken());
		
		int  arr[] = new int[N];
        tmp = new int[N];
        
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Merge_sort(arr, 0, arr.length-1);

		bw.write(result + " ");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
