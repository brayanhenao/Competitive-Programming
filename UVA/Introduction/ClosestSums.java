package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * UVA 10487 - Closest Sums
 * Brayan Henao - 14103001
 * UVA ID: 793299
 */

class ClosestSums {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int caso = 1;

		String linea = in.readLine();
		while (!linea.equals("0")) {
			int num = Integer.parseInt(linea);

			int[] aux = new int[num];
			for (int i = 0; i < num; i++) {
				aux[i] = Integer.parseInt(in.readLine());
			}
			int[] sum = new int[num * (num - 1) / 2];
			int k = 0;
			for (int i = 0; i < num; ++i) {
				for (int j = i + 1; j < num; ++j) {
					sum[k++] = aux[i] + aux[j];
				}
			}
			Arrays.sort(sum);
		
			int m = Integer.parseInt(in.readLine());
			out.write("Case " + caso + ":" + "\n");
			for (int i = 0; i < m; i++) {
				int buscado = Integer.parseInt(in.readLine());
				int diferencia = Integer.MAX_VALUE;
				int retorno = 0;

				int j;

				for (j = 0; j < sum.length; j++) {
					if (Math.abs(buscado - sum[j]) <= diferencia) {
						diferencia = Math.abs(buscado - sum[j]);
						retorno = sum[j];
					}
				}
				out.write("Closest sum to " + buscado + " is " + retorno + "." + "\n");

			}
			caso++;
			linea = in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}
