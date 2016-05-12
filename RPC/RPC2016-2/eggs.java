import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class eggs {

	private static int narr = 1000001;
	private static int[] arreglo = new int[narr];

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		llenarArreglo();

		while (linea != null ) {
			int n = Integer.parseInt(linea);
			int c = 0;
			while (n != 0) {
				n -= arreglo[n];
				c++;
			}
			out.write(c+"\n");
			// System.out.println(Arrays.toString(arreglo));
			linea = in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}

	private static void llenarArreglo() {
		arreglo[0] = 1;
		arreglo[1] = 1;
		for (int i = 2; i < arreglo.length; i++) {
			if (arreglo[i] == 0) {
				for (int j = i; j < arreglo.length; j += i) {
					arreglo[j] = i;
				}
			}
		}

	}
}
