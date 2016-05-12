package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
 * UVA 713 - Adding Reversed Numbers
 * Brayan Henao - 14103001
 * UVA ID: 793299
 */
class AddingReversedNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(in.readLine().trim());

		for (int i = 0; i < n; i++) {

			StringTokenizer tk = new StringTokenizer(in.readLine(), " ");
			BigInteger a = new BigInteger(new StringBuilder(tk.nextToken()).reverse().toString());
			BigInteger b = new BigInteger(new StringBuilder(tk.nextToken()).reverse().toString());
			BigInteger sum = new BigInteger(a.add(b).toString());

			out.write(new StringBuilder(sum.toString()).reverse().toString().replaceFirst("^0*", "") + "\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}
