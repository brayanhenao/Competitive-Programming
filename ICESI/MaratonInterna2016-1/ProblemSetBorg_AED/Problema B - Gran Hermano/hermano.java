import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;


public class hermano {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		int c = Integer.parseInt(linea);
		
		String sep = "";
		for (int i = 0; i < c; i++) {
			linea = br.readLine();
			String[] valores = linea.split(" ");
			int n = Integer.parseInt(valores[0]);
			int q = Integer.parseInt(valores[1]);
			TreeMap<String, String> arbol = new TreeMap<>();
			for (int j = 0; j < n; j++) {
				linea = br.readLine();
				arbol.put(linea, linea);
			}
			bw.write(sep);
			for (int j = 0; j < q; j++) {
				linea = br.readLine();
				String v = arbol.get(linea);
				if(v==null){
					bw.write("NO\n");
				}else{
					bw.write("SI\n");
				}
			}
			sep = "\n";
		}
		br.close();
		bw.close();
	}
}
