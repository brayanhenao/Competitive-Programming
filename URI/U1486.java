import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U1486 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea;
		int[][] mat;
		while ((linea = in.readLine()) != null && !linea.equals("0 0 0")) {
			StringTokenizer tk = new StringTokenizer(linea);
			int p, n, c;
			p = Integer.parseInt(tk.nextToken());
			n = Integer.parseInt(tk.nextToken());
			c = Integer.parseInt(tk.nextToken());
			mat = new int[n][p];
			for (int i = 0; i < n; i++) {
				tk = new StringTokenizer(in.readLine());
				for (int j = 0; j < p; j++) {
					mat[i][j]=Integer.parseInt(tk.nextToken());
				}
			}
			int resultado = 0;
			for (int i = 0; i < p; i++) {
				int contador = 0;
				for (int j = 0; j < n; j++) {
					if (mat[j][i] != 0) {
						contador++;
					} else {
						contador = 0;
					}

					if (contador == c) {
						resultado++;
					}
				}
			}
			out.write(resultado+"\n");

		}
		in.close();
		out.flush();
		out.close();
	}

}