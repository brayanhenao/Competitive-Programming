package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class AgeSort {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();

		while (linea != null && !linea.equals("0")) {
			int n=Integer.parseInt(linea);
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int[] edades = new int[tk.countTokens()];
			for (int i = 0; i<n; i++) {
				edades[i] = Integer.parseInt(tk.nextToken());
			}
			Arrays.sort(edades);
			StringBuilder st=new StringBuilder();
			
			for (int i = 0; i < edades.length; i++) {
				st.append(edades[i] + " ");
			}
			out.write(st.toString() + "\n");
			
			linea = in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}
