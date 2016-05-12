import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Reader_Writter {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {
			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {

			}

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

}
