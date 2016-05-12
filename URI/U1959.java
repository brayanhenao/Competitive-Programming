import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class U1959 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		
		while ((linea=in.readLine())!=null) {
			StringTokenizer tk=new StringTokenizer(linea);
			long a=Long.parseLong(tk.nextToken());
			long b=Long.parseLong(tk.nextToken());
			
			out.write((a*b)+"\n");
			
			
		}
		in.close();
		out.flush();
		out.close();
	}
}
