package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class EcologicalPremium {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		StringTokenizer tk;
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int n2=Integer.parseInt(in.readLine());
				int suma=0;
				for (int j = 0; j < n2; j++) {
					tk=new StringTokenizer(in.readLine());
					int tamano=Integer.parseInt(tk.nextToken());
					int animales=Integer.parseInt(tk.nextToken());
					int respetoMedioAmbiente=Integer.parseInt(tk.nextToken());
					suma+=tamano*respetoMedioAmbiente;
				}
				out.write(suma+"\n");
			}
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
