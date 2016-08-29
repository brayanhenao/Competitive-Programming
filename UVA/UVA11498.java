package Introduction;
import java.io.*;
import java.util.StringTokenizer;

class DivisionNLognia {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("0")) {
			int num = Integer.parseInt(linea);
			StringTokenizer tk = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());

			for (int i = 0; i < num; i++) {
				tk = new StringTokenizer(in.readLine());
				int x = Integer.parseInt(tk.nextToken());
				int y = Integer.parseInt(tk.nextToken());
				;
				out.write(getRegion(n, m, x, y) + "\n");
				out.write("");
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

	public static String getRegion(int cx, int cy, int x, int y) {

		// on border
		if (x == cx || y == cy) {
			return "divisa";
		}

		// on right
		if (x > cx) {
			if (y > cy) {
				return "NE";
			} else {
				return "SE";
			}
		} else {

			// on left
			if (y > cy) {
				return "NO";
			} else
				return "SO";
		}
	}
}
