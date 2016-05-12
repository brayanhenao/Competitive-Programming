import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class ZerosAndOnes {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = in.readLine();
		StringTokenizer tk;
		int caso=1;
		while (linea != null && !linea.equals("0 0")) {
			int n = Integer.parseInt(in.readLine());
			out.write("Case "+caso+":\n");
			for (int i = 0; i < n; i++) {
				tk=new StringTokenizer(in.readLine());
				int indexi=Integer.parseInt(tk.nextToken());
				int indexj=Integer.parseInt(tk.nextToken())+1;
				String subCad=linea.substring(Math.min(indexi, indexj),Math.max(indexi, indexj));
				out.write(subCad.equals(voltearCadena(subCad))? "Yes\n":"No\n");
			}
			caso++;
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();

	}

	public static String voltearCadena(String cad) {
		StringBuilder b = new StringBuilder(cad);
		return b.reverse().toString();
	}
}
