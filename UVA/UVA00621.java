package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class SecretResearch {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();

		while (linea != null && !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				String numero=in.readLine();
				if (numero.equals("1")||numero.equals("4")||numero.equals("78")) {
					out.write("+\n");
				} else if (numero.endsWith("35")) {
					out.write("-\n");
				} else if (numero.startsWith("190")) {
					out.write("?\n");
				}else{
					out.write("*\n");
				}
			}
			

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
