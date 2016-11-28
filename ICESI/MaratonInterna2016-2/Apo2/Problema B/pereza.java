import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pereza {

	static int numNiveles;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ln = br.readLine();

		int casos = Integer.parseInt(ln);

		for (int j = 0; j < casos; j++) {

			ln = br.readLine();

			numNiveles = Integer.parseInt(ln);

			if (numNiveles == 1) {
				bw.write("_\n");
			} else {

				int numero = (int) Math.pow(3, numNiveles - 1);

				char[] linea = new char[numero];

				for (int i = 0; i < linea.length; i++) {
					linea[i] = '_';
				}

				LlenarLinea(linea, 0, 0, numero / 3);

				bw.write(new String(linea) + "\n");

			}

		}

		bw.close();
		br.close();

	}

	private static void LlenarLinea(char[] linea, int i, int n, int l) {

		if (n == numNiveles - 2) {
			linea[i] = '|';
			linea[i + 2] = '|';
		} else {

			LlenarLinea(linea, i, n + 1, l / 3);
			LlenarLinea(linea, i + l * 2, n + 1, l / 3);
		}

	}

}
