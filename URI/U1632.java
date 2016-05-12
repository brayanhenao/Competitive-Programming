import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U1632 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] letras = { 'A', 'E', 'I', 'O', 'S' };
		char[] letrasm = { 'a', 'e', 'i', 'o', 's' };
		String linea;
		while ((linea = in.readLine()) != null) {
			int casos = Integer.parseInt(linea);
			for (int i = 0; i < casos; i++) {
				String cad = in.readLine();
				int resultado = 1;
				for (int j = 0; j < cad.length(); j++) {
					boolean adicion = false;
					for (int k = 0; k < letras.length; k++) {
						if (cad.charAt(j) == letras[k] || cad.charAt(j) == letrasm[k]) {
							adicion = true;
						}
					}
					if (adicion) {
						resultado *= 3;
					} else {
						resultado *= 2;
					}

				}
				out.write(resultado + "\n");
			}
		}
		in.close();
		out.flush();
		out.close();
	}

}