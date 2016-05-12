package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class SaveSetu {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();

		while (linea != null && !linea.equals("")) {
			int n = Integer.parseInt(linea);
			long num = 0;
			for (int i = 0; i < n; i++) {
				String[] operacion = in.readLine().split(" ");
				if (operacion[0].equals("donate")) {
					num += Integer.parseInt(operacion[1]);
				} else {
					out.write(num + "\n");
				}
			}

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
