package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Factorial500 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		while (linea!=null&& !linea.equals("")) {
			BigInteger num=BigInteger.ONE;
			int n=Integer.parseInt(linea);
				for (int i = 2; i <= n; i++) {
					num=num.multiply(BigInteger.valueOf(i));
				}
				out.write(n+"!\n");
				out.write(num+"\n");
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
