package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class LeapYearOrNotLeapYearOrHaluculu {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		
		while (linea!=null&& !linea.equals("")) {
			BigInteger num=new BigInteger(linea);
			if (esBisiesto(num)) {
				out.write("This is leap year.\n");
			}
			if (esHuluculu(num)) {
				out.write("This is huluculu festival year.\n");
			}
			if (esBulukulu(num)) {
				out.write("This is bulukulu festival year.\n");
			}
			if (!esBulukulu(num)&&!esHuluculu(num)&&!esBisiesto(num)) {
				out.write("This is an ordinary year.\n");
			}
			out.write("\n");
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	
	public static boolean esBisiesto(BigInteger n){
		if (modulo(n, 4) && (modulo(n, 400)||!modulo(n, 100))) {
			return true;
		}
		return false;
	}
	
	public static boolean esHuluculu(BigInteger n){
		if (modulo(n, 15)) {
			return true;
		}
		return false;
	}
	
	public static boolean esBulukulu(BigInteger n){
		if (modulo(n, 55)) {
			return true;
		}
		return false;
	}
	
	public static boolean modulo(BigInteger año, int n){
	return año.mod(BigInteger.valueOf(n)).compareTo(BigInteger.ZERO)==0;	
	}
}
