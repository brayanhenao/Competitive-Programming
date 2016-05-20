import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class U1260 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		double total;
		Map<String, Integer> acumulados = new TreeMap<>();
			int n = Integer.parseInt(in.readLine());
			in.readLine();
			for (int i = 0; i < n; i++) {
				acumulados.clear();
				total = 0;
				while (true) {
					linea = in.readLine();
					if (linea==null || linea.equals("")) {
						break;
					}
					if (acumulados.containsKey(linea)) {
						acumulados.put(linea, acumulados.get(linea) + 1);
					} else {
						acumulados.put(linea, 1);
					}
					total++;
				}
				DecimalFormat f = new DecimalFormat("0.0000");
				for (Map.Entry<String, Integer> entrada : acumulados.entrySet()) {
					double porcentaje = (entrada.getValue() * 100) / total;
					out.write(entrada.getKey() + " " + f.format(porcentaje) + "\n");
				}
				if (i!=n-1) {
					out.write("\n");
				}

			}
		
		out.flush();
		out.close();
		in.close();

	}

}
