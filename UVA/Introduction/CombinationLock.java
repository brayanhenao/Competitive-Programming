package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class CombinationLock {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("0 0 0 0")) {
			StringTokenizer tk=new StringTokenizer(linea);
			int n=Integer.parseInt(tk.nextToken());
			int combinacion1=Integer.parseInt(tk.nextToken());
			int combinacion2=Integer.parseInt(tk.nextToken());
			int combinacion3=Integer.parseInt(tk.nextToken());
			
			
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
