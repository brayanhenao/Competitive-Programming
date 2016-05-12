package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class EventPlanning {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {
			StringTokenizer tk = new StringTokenizer(linea);
			int n = Integer.parseInt(tk.nextToken());
			int presupuesto = Integer.parseInt(tk.nextToken());
			int hoteles = Integer.parseInt(tk.nextToken());
			int semanas = Integer.parseInt(tk.nextToken());
			int[] costos = new int[hoteles];
			int contador = 0;

			for (int i = 0; i < hoteles; i++) {
				int precioPersona = Integer.parseInt(in.readLine());
				String[] camas = in.readLine().split(" ");
				for (int j = 0; j < semanas; j++) {
					if (Integer.parseInt(camas[j]) >= n) {
						if (n * precioPersona <= presupuesto) {
							costos[contador] = n * precioPersona;
							contador++;
							break;
						}
					}
				}
			}
			int res = costos[0];
			if (contador > 0) {
				for (int i = 0; i < contador; i++) {
					res = Math.min(res, costos[i]);
				}
				out.write(res + "\n");
			} else {
				out.write("stay home\n");
			}
			linea = in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}

}
