package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class DivideButNotQuiteConquer {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk;
		while (linea != null && !linea.equals("")) {
			tk=new StringTokenizer(linea);
			boolean boring=true;
			int numero=Integer.parseInt(tk.nextToken());
			int divisor=Integer.parseInt(tk.nextToken());
			
			while (numero>1  && !boring) {
				if (numero%divisor!=0) {
					boring=true;
				}else{
					numero=numero/divisor;
				}
			}
			

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
