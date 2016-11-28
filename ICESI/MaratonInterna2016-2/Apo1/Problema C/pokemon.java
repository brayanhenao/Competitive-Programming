import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class pokemon {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(in.readLine());
		StringTokenizer tk;
		int caso = 1;
		while (t-- > 0) {
			tk = new StringTokenizer(in.readLine());
			String nombre = tk.nextToken();
			int nivel = Integer.parseInt(tk.nextToken());

			int[] valores = new int[4];
			for (int i = 0; i < 4; i++) {
				tk = new StringTokenizer(in.readLine());
				int bs = Integer.parseInt(tk.nextToken());
				int iv = Integer.parseInt(tk.nextToken());
				int ev = Integer.parseInt(tk.nextToken());
				if(i==0){
					valores[i] = formulaHP(bs, iv, ev, nivel);
				}else{
					valores[i] = formula(bs, iv, ev, nivel);
				}
			}

			out.write("Caso #" + caso++ + ": " + nombre + " nivel " + nivel + "\n");
			out.write("HP: " + valores[0] + "\n");
			out.write("AT: " + valores[1] + "\n");
			out.write("DF: " + valores[2] + "\n");
			out.write("SP: " + valores[3] + "\n");
		}

		in.close();
		out.close();

	}

	public static int formula(int bs, int iv, int ev, int lvl) {
		double resul = iv + bs + (Math.sqrt(ev) / 8);
		resul *= lvl;
		resul /= 50;
		return (int)resul+5;

	}
	
	public static int formulaHP(int bs, int iv, int ev, int lvl) {
		double resul = iv + bs + (Math.sqrt(ev) / 8)+50;
		resul *= lvl;
		resul /= 50;
		return (int)resul+10;

	}

}
