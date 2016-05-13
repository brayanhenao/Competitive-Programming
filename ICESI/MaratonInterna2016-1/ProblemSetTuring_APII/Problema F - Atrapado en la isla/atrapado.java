import java.util.*;
import java.io.*;
public class atrapado {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		String line;
		StringTokenizer tk;
		while (!(line = in.readLine()).isEmpty()) {
			tk=new StringTokenizer(line);
			
			String ingles = tk.nextToken();
			String extrano = tk.nextToken();
			diccionario.put(extrano, ingles);
		}
		while ((line = in.readLine()) != null) {
			if (diccionario.containsKey(line)){
				out.write(diccionario.get(line)+"\n");
			}else{
				out.write("eh\n");
			}
		}
		
		out.flush();
		out.close();
		in.close();
	}
}
