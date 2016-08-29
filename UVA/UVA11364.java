package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Parking {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int[] tiendas;
		
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int ntiendas=Integer.parseInt(in.readLine());
				StringTokenizer tk=new StringTokenizer(in.readLine());
				tiendas=new int[ntiendas];
				for (int j = 0; j < ntiendas; j++) {
					tiendas[j]=Integer.parseInt(tk.nextToken());
				}
				Arrays.sort(tiendas);
				int max=tiendas[ntiendas-1];
				int min=tiendas[0];
				out.write(2*(max-min)+"\n");
				
			}
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
