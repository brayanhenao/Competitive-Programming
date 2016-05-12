package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class HashmatTheBraveWarrior {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("")) {
			StringTokenizer tk=new StringTokenizer(linea);
			out.write(Math.abs(Integer.parseInt(tk.nextToken())-Integer.parseInt(tk.nextToken()))+"\n");
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
