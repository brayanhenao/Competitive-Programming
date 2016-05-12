import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class U1239 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;

		while ((s = in.readLine()) != null) {
			
			boolean uno = false;
			boolean dos = false;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '_') {
					if (uno) {
						out.write("</i>");
						uno = !uno;
					} else {
						out.write("<i>");
						uno = !uno;
					}
				} else if (s.charAt(i) == '*') {
					if (dos) {
						out.write("</b>");
						dos = !dos;
					} else {
						out.write("<b>");
						dos = !dos;
					}
				} else {
					out.write(s.charAt(i));
				}
			}
			out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}
