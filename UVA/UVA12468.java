package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Zapping {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk;
		while (linea != null && !linea.equals("-1 -1")) {
			tk = new StringTokenizer(linea);
			int canalInicio = Integer.parseInt(tk.nextToken());
			int canalFin = Integer.parseInt(tk.nextToken());
			
			int direccionA=Math.abs(canalInicio-canalFin);
			int direccionB=100-Math.abs(canalFin-canalInicio);
			
			out.write(direccionA<direccionB? direccionA+"\n": direccionB+"\n");
			
			

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
