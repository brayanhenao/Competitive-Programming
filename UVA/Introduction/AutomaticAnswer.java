package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class AutomaticAnswer {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int ntest=Integer.parseInt(in.readLine());
				String  numero=Integer.toString(((((((ntest*567)/9)+7492)*235)/47))-498);
				out.write(numero.charAt(numero.length()-1)+"\n");
			}			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
