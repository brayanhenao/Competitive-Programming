import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;


public class UVA01226 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n=Integer.parseInt(in.readLine());
		while(n-->0){
			BigInteger a=new BigInteger(in.readLine().trim());
			BigInteger b=new BigInteger(in.readLine().trim());
			out.println(b.mod(a).toString());
		}

		in.close();
		out.close();
	}
}
