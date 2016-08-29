package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class OneTwoThree {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			
			for (int i = 0; i < n; i++) {
				String cad=in.readLine();
				if (cad.length()==5) {
					out.write(3+"\n");
				}else{
					if ((cad.charAt(0)=='o'&&cad.charAt(1)=='n') ||
						(cad.charAt(0)=='o'&&cad.charAt(2)=='e') ||
						(cad.charAt(1)=='n'&&cad.charAt(2)=='e')) {
						out.write(1+"\n");
					}else{
						out.write(2+"\n");
					}
				}
			}
			
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
