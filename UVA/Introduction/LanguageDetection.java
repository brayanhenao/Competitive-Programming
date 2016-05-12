package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class LanguageDetection {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int caso =1;
		while (linea!=null&& !linea.equals("#")) {
			
			if (linea.equals("HELLO")) {
				out.write("Case "+caso+": ENGLISH\n");
			}else if(linea.equals("HOLA")){
				out.write("Case "+caso+": SPANISH\n");
			}else if(linea.equals("HALLO")){
				out.write("Case "+caso+": GERMAN\n");
			}else if(linea.equals("BONJOUR")){
				out.write("Case "+caso+": FRENCH\n");
			}else if(linea.equals("CIAO")){
				out.write("Case "+caso+": ITALIAN\n");
			}else if(linea.equals("ZDRAVSTVUJTE")){
				out.write("Case "+caso+": RUSSIAN\n");
			}else{
				out.write("Case "+caso+": UNKNOWN\n");
			}
			caso++;
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
