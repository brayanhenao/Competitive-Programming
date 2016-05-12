import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class U1430 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		Map<Character, Double> map=new HashMap<>();
		map.put('W', 1.0);
		map.put('H', 0.5);
		map.put('Q', 0.25);
		map.put('E', 0.125);
		map.put('S', 0.0625);
		map.put('T', 0.03125);
		map.put('X', 0.015625);
		
		while ((linea=in.readLine())!=null) {
			if (linea.equals("*")) {
				break;
			}
			
			StringTokenizer tk=new StringTokenizer(linea, "/");
			int answ=0;
	
			while (tk.hasMoreElements()) {
				String lin=tk.nextToken();
				double sum=0;
				for (int i = 0; i < lin.length(); i++) {
					sum+=map.get(lin.charAt(i));
				}
				if (sum==1.0) {
					answ++;
				}
				
			}
			out.write(answ+"\n");
			
			
		}
		in.close();
		out.flush();
		out.close();
	}
}
