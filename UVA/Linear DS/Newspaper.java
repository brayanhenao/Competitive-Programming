import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

class Newspaper {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		HashMap<Character, Double> pagados;
		StringTokenizer tk;
		while (linea != null && !linea.equals("")) {
			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int ncaracteres=Integer.parseInt(in.readLine());
				pagados=new HashMap<>();
				for (int j = 0; j < ncaracteres; j++) {
					tk=new StringTokenizer(in.readLine().trim());
					pagados.put(tk.nextToken().charAt(0), Double.parseDouble(tk.nextToken()));
				}
				double totalPagado=0;
				int nlineastexto=Integer.parseInt(in.readLine());
				for (int j = 0; j < nlineastexto; j++) {
					String lineaTexto=in.readLine();
					for (int k = 0; k < lineaTexto.length(); k++) {
						if (pagados.containsKey(lineaTexto.charAt(k))) {
							totalPagado+=pagados.get(lineaTexto.charAt(k));
						}
					}
				
				}
				
//				DecimalFormat df=new DecimalFormat("#.##$");
//				out.write(df.format(totalPagado/100)+"\n");
				System.out.printf("%.2f$%n",totalPagado/100);
			}
			

			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
