import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class fibonacci {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		int[] fib = new int[31];
		fib[0] = 1; fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2] + 1;
		}
		
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			int n = Integer.parseInt(linea);
			int f = fib[n];
			bw.write(f+"\n");
		}
		br.close();
		bw.close();
	}
}
