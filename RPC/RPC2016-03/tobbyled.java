import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class tobbyled {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();
		StringTokenizer tk;
		while (linea != null && !linea.equals("")) {
			tk = new StringTokenizer(linea);
			int nleds = Integer.parseInt(tk.nextToken());
			long tiempo = Long.parseLong(tk.nextToken());
			String direccion = tk.nextToken();
			String lineaUp = in.readLine();
			StringTokenizer infoleds = new StringTokenizer(in.readLine(), "|");
			String lineaDown = in.readLine();
			String[] arr = new String[nleds];
			// for (int i = 0; infoleds.hasMoreElements(); i++) {
			// arr[i] = infoleds.nextToken();
			// }
			if (direccion.equals("L")) {
				// String[] arraux = new String[nleds];
				for (int i = 0; i < nleds; i++) {

					// String aux = arr[i];
					int n = (int) ((nleds - (tiempo % nleds) + i) % nleds);
					//// arraux[(int) (((nleds - (tiempo % nleds) + i)) %
					//// nleds)] = aux;
					arr[n] = infoleds.nextToken();
				}

				StringBuilder b = new StringBuilder("|");

				for (String element : arr) {
					b.append(element.toString() + "|");
				}

				out.write(lineaUp + "\n");
				out.write(b.toString() + "\n");
				out.write(lineaDown + "\n");

			} else {
				for (int i = 0; i < nleds; i++) {
					int n = (int) ((tiempo + i) % nleds);
					arr[n] = infoleds.nextToken();
					// String aux = arr[i];
					// arraux[(int) ((i + (tiempo%nleds)) % nleds)] = aux;
				}

				StringBuilder b = new StringBuilder("|");

				for (String element : arr) {
					b.append(element.toString() + "|");
				}

				out.write(lineaUp + "\n");
				out.write(b.toString() + "\n");
				out.write(lineaDown + "\n");
			}
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

}
