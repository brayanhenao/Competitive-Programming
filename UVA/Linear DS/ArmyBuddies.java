import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class ArmyBuddies {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk;
		int[] izquierda;
		int[] derecha;
		while (linea != null && !linea.equals("0 0")) {
			tk = new StringTokenizer(linea);
			int nsoldados=Integer.parseInt(tk.nextToken());
			int nreportebajas=Integer.parseInt(tk.nextToken());
			izquierda=new int[nsoldados+2];
			derecha=new int[nsoldados+2];
			for (int i = 1; i <= nsoldados; i++) {
				izquierda[i]=i-1;
				derecha[i]=i+1;
			}
			derecha[nsoldados]=0;
			for (int i = 0; i < nreportebajas; i++) {
				tk=new StringTokenizer(in.readLine());
				int l=Integer.parseInt(tk.nextToken());
				int r=Integer.parseInt(tk.nextToken());
				
				if (izquierda[l]==0) {
					out.write("* ");
				}else{
					out.write(izquierda[l]+" ");
				}
				if (derecha[r]==0) {
					out.write(" *\n");
				}else{
					out.write(derecha[r]+"\n");
				}
				izquierda[derecha[r]]=izquierda[l];
				derecha[izquierda[l]]=derecha[r];
			}
			out.write("-\n");

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
