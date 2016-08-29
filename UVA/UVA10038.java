import java.io.*;
import java.util.*;

class JollyJumpers {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();
		StringTokenizer tk;
		int n ;
		int[] numeros;
		while (linea != null && !linea.equals("") ) {
			tk= new StringTokenizer(linea);
			n= Integer.parseInt(tk.nextToken());
			numeros = new int[n];
			for (int i = 0; i < n; i++) {
				numeros[i] = Integer.parseInt(tk.nextToken());
			}
			out.write(isJolly(numeros)+"\n");
			linea = in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	private static String isJolly(int[] numeros) {
		
		List resultados=new ArrayList<>();
//		ArrayList<Integer> resultados = new ArrayList<>();
		for (int i = 0; i < numeros.length - 1; i++) {
			int resultado = Math.abs(numeros[i] - numeros[i + 1]);
			if (resultado == 0) {
				return "Not jolly";
			}
			if (resultado >= numeros.length) {
				return "Not jolly";
			}
			if (resultados.contains(resultado)) {
				return "Not jolly";
			}

			resultados.add(resultado);
		}
		return "Jolly";
	}


}
