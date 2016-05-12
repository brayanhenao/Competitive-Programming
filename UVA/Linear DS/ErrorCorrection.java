import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * UVA 541 - Error Correction
 * Brayan Henao - 14103001
 * UVA ID: 793299
 */

class ErrorCorrection {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();

		while (linea != null && !linea.equals("0")) {
			int tamano = Integer.parseInt(linea);

			int[][] matriz = new int[tamano][tamano];
			int[] columna = new int[tamano];
			int[] fila = new int[tamano];

			for (int i = 0; i < tamano; i++) {
				StringTokenizer tk = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < tamano; j++) {
					matriz[i][j] = Integer.parseInt(tk.nextToken());
					;
					fila[i] += matriz[i][j];
					columna[j] += matriz[i][j];
				}
			}
			int contador = 0;
			int posicionX = 0;
			int posicionY = 0;
			
			for (int i = 0; i < tamano; i++) {
				for (int j = 0; j < tamano; j++) {
					if (fila[i] % 2 == 1 && columna[j] % 2 == 1) {
						contador++;
						fila[i]--;
						columna[j]--;
						posicionX = i + 1;
						posicionY = j + 1;
					}
				}
			}

			for (int i = 0; i < tamano; i++) {
				if (fila[i] % 2 == 1 || columna[i] % 2 == 1) {
					contador = 10;
				}
			}
			if (contador == 1) {
				System.out.println("Change bit (" + posicionX + "," + posicionY + ")");
			} else if (contador == 0) {
				System.out.println("OK");
			} else {
				System.out.println("Corrupt");
			}
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

}
