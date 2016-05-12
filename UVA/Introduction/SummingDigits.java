package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class SummingDigits {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("0")) {
			out.write(sumaDigitos(linea)+"\n");
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	
	public static int sumaDigitos(String cadena){
		if (cadena.length()==1) {
			return Integer.parseInt(cadena.charAt(0)+"");
		}else{
			int suma=0;
			for (int i = 0; i < cadena.length(); i++) {
				suma+=Integer.parseInt(cadena.charAt(i)+"");
			}
			return sumaDigitos(Integer.toString(suma));
		}
	}
}
