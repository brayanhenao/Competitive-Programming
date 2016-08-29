package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * UVA 10082 - WERTYU
 * Brayan Henao - 14103001
 * UVA ID: 793299
 */

class WERTYU {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String teclado = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {

			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) == ' ') {
					out.write(" ");
				} else {
					int indice=teclado.indexOf(linea.charAt(i));
					out.write(teclado.charAt(indice - 1));
				}
			}
			out.write("\n");
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();

	}

}