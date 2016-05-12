package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class LumberjackSequencing {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk;
		while (linea != null && !linea.equals("")) {
			int n = Integer.parseInt(linea);
			out.write("Lumberjacks:");
			for (int i = 0; i < n; i++) {
				tk = new StringTokenizer(in.readLine());
				int primero = Integer.parseInt(tk.nextToken());
				boolean ordenado=true;
				boolean ordenadoAs = true;
				boolean ordenadoDes=true;
				while (tk.hasMoreElements()) {
					int num = Integer.parseInt(tk.nextToken());
					if (num > primero) {
						if (ordenadoAs) {
							primero = num;
							ordenadoDes=false;
						}else{
							ordenado=false;
							out.write("Unordered\n");
							break;
						}
					} else if(num<primero){
						if (ordenadoDes) {
							primero = num;
							ordenadoAs=false;
						}else{
							ordenado=false;
							out.write("Unordered\n");
							break;
						}
					}else{
						ordenado=false;
						out.write("Unordered\n");
						break;
					}
				}
				if (ordenado) {
					out.write("Ordered\n");
				}
				
			}
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
