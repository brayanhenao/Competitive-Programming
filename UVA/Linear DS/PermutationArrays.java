import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class PermutationArrays {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		StringTokenizer tk1, tk2;
		TreeMap<Integer, String> map;
		while (linea != null && !linea.equals("")) {

			int n = Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				map = new TreeMap<>();
				in.readLine();
				tk1 = new StringTokenizer(in.readLine());
				tk2 = new StringTokenizer(in.readLine());
				while (tk2.hasMoreElements()) {
					map.put(Integer.parseInt(tk1.nextToken()), tk2.nextToken());
				}
				for (Map.Entry<Integer, String> entry : map.entrySet()) {
					out.write(entry.getValue() + "\n");
				}
				if (i==n-1) {
					
				}else out.write("\n");
			}
			linea = in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
