import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;


public class advanced {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		
		while (linea != null && !linea.equals("0")) {
			
			long num=Long.parseLong(linea);
			long nume=(num*(num+1))/2L;
			BigInteger resultado=new BigInteger(String.valueOf(nume));
			BigInteger respuesta=resultado.multiply(resultado);
			String n=respuesta.toString();
			if (n.length()>10) {
				n=n.substring(n.length()-10,n.length());
			}
			String res="";
			boolean cero=false;
			for (int i = 0; i <n.length(); i++) {
				if (n.charAt(i)!='0'||cero) {
					cero=true;
					res+=n.charAt(i);
				}
			}
			
			if (res.length()==0) {
				res+='0';
			}
			
			out.write(res+"\n");
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
