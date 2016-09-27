import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class UVA00489 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		while ((linea = in.readLine()) != null && !linea.equals("-1")) {
			int caso = Integer.parseInt(linea);
			out.write("Round "+caso+"\n");
			char[] palabra = in.readLine().toCharArray();
			char[] adivinadas = in.readLine().toCharArray();
			boolean gano = true;
			boolean chickened = false;
			int jack = 0;
			Set<Character> total = new TreeSet<>();
			Set<Character> correctas = new TreeSet<>();
			Set<Character> malas=new TreeSet<>();

			for (int i = 0; i < palabra.length; i++) {
				total.add(palabra[i]);
			}

			for (int i = 0; i < adivinadas.length; i++) {
				if (total.contains(adivinadas[i])) {
					correctas.add(adivinadas[i]);
					total.remove(adivinadas[i]);
				} else {
					if (!correctas.contains(adivinadas[i]) && !malas.contains(adivinadas[i])) {
						jack++;
						malas.add(adivinadas[i]);
					}
				}
				if (jack == 7) {
					chickened=false;
					gano = false;
					break;
				} else {
					if (total.isEmpty()) {
						chickened=false;
						break;
					} else {
						chickened = true;
					}
				}
			}
			if (chickened) {
				out.write("You chickened out.\n");
			} else if (gano) {
				out.write("You win.\n");
			} else {
				out.write("You lose.\n");
			}

		}
		in.close();
		out.flush();
		out.close();
	}

}
