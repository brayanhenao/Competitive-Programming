import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class acronyms {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea=in.readLine();

		StringTokenizer tk;
		StringTokenizer tk2;
		while (linea!= null && !linea.equals("")) {
			tk = new StringTokenizer(linea);
			tk2 = new StringTokenizer(in.readLine());
			int n = tk.countTokens();

			// nombres=new String[tk.countTokens()];
			// entradas=new String[tk.countTokens()];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (tk.nextToken().charAt(0) == tk2.nextToken().charAt(0)) {
					sum++;
				}
			}

			out.write(sum == n ? "yes\n" : "no\n");
			linea=in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}
