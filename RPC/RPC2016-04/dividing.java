import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class dividing {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {
			BigInteger num=new BigInteger(linea, 16);
			BigInteger md=new BigInteger("11", 16);
			if (num.mod(md).equals(BigInteger.ZERO)) {
				out.write("yes\n");
			}else{
				out.write("no\n");
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
