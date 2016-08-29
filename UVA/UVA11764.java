package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class JumpingMario {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk;
		int caso = 1;
		while (linea != null && !linea.equals("")) {
			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int saltosAltos = 0;
				int saltosBajos = 0;
				int nparedes = Integer.parseInt(in.readLine());

				tk = new StringTokenizer(in.readLine());
				int primero = Integer.parseInt(tk.nextToken());
				if (nparedes <= 1) {
					out.write("Case " + caso + ": 0 0\n");
				} else {
					while (tk.hasMoreElements()) {
						int tam = Integer.parseInt(tk.nextToken());
						if (tam > primero) {
							saltosAltos++;
						} else if (tam < primero) {
							saltosBajos++;
						}
						primero = tam;
					}
					out.write("Case " + caso + ": " + saltosAltos + " " + saltosBajos + "\n");
				}
				caso++;
			}

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
