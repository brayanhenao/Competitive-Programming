package Introduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TEXQuotes {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();

		boolean abierto = false;
		while (linea != null && !linea.equals("")) {
			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) == '\"') {
					if (abierto) {
						System.out.print("''");
					} else {
						System.out.print("``");
					}
					abierto = !abierto;
				} else {
					System.out.print(linea.charAt(i));
				}
			}
			System.out.println();
			linea = in.readLine();
		}
		in.close();
	}
}
