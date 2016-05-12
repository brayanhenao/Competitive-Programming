import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class deviation {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		
		while(linea!=null && !linea.equals("0")){
			double n=Double.parseDouble(linea);
			double sd=0;
			double standard;
			double up=(n*((2*n)-1)*((2*n)+1))/3;
			double resul=up-(Math.pow(n, 3));
			standard=Math.sqrt(resul/(n-1));
//			standard-=0.00000001;
			Locale.setDefault(new Locale("en", "US"));
		
			DecimalFormat df = new DecimalFormat("#.000000");
			df.setRoundingMode(RoundingMode.HALF_DOWN);
			out.write(df.format(standard)+"\n");
			linea=in.readLine();
		}
		
		in.close();
		out.flush();
		out.close();
		
	
	}
	
}
