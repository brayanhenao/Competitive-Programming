import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BoxOfBricks {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		StringTokenizer tk;
		int[] bloques;
		int suma,nbloques,movimientos,caso=1;
		while (linea!=null&& !linea.equals("0")) {
			int n=Integer.parseInt(linea);
			bloques=new int[n];
			tk=new StringTokenizer(in.readLine());
			suma=0;
			out.write("Set #"+caso+"\n");
			for (int i = 0; i < n; i++) {
				bloques[i]=Integer.parseInt(tk.nextToken());
				suma+=bloques[i];
			}
			
			nbloques=suma/n;
			movimientos=0;
			for (int i = 0; i < bloques.length; i++) {
				if (bloques[i]<nbloques) {
					movimientos+=(nbloques-bloques[i]);
				}
			}
			
			out.write("The minimum number of moves is "+movimientos+".\n");
			out.write("\n");
			caso++;
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
