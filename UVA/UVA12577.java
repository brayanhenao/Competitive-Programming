package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Hajj_e_Akbar {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int casos =1;
		while (linea!=null&& !linea.equals("*")) {
			if (linea.equals("Hajj")) {
				out.write("Case "+casos+": Hajj-e-Akbar\n");
			}else{
				out.write("Case "+casos+": Hajj-e-Asghar\n");
			}
			casos++;
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
