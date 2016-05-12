package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class EmoogleBalance_RUNTIME {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		int caso = 1;
		StringTokenizer tk;
		while (linea != null && !linea.equals("0")) {
			int numeroEventos = Integer.parseInt(linea);
			tk = new StringTokenizer(in.readLine());
			int invitaciones = 0;
			for (int i = 0; i < numeroEventos; i++) {
				if (!tk.nextToken().equals("0")) {
					invitaciones++;
				}else{
					invitaciones--;
				}
			}
			out.write("Case " + caso + ": " + invitaciones + "\n");
			caso++;
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
