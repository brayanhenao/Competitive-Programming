import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class vowel {
	public static boolean esVocal(char c){
		if (c=='a' ||c=='e' || c=='i' ||c=='o' ||c=='u') {
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		
		while (linea!=null && !linea.equals("")) {
			int n=Integer.parseInt(linea);
			
			for (int i = 0; i < n; i++) {
				String c=in.readLine();
				int contadorV=0;
				int contadorC=0;
				out.write(c+"\n");
				for (int j = 0; j < c.length(); j++) {
					if (esVocal(c.charAt(j))) {
						contadorV ++;
						
					} else{
						contadorC++;
					
					}
					
				}
				if (contadorV>contadorC) {
					out.write("1"+"\n");
				}else{
					out.write("0"+"\n");
				}
			}
			linea=in.readLine();
		}
		
		in.close();
		out.flush();
		out.close();
	}
}
