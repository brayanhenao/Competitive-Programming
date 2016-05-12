package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class PackingForHoliday {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int caso=1;
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int max=0;
				StringTokenizer tk=new StringTokenizer(in.readLine());
				while (tk.hasMoreElements()) {
					if (Integer.parseInt(tk.nextToken())>20) {
						max++;
					}
				}
				if (max>0) {
					out.write("Case "+caso+": bad\n");
				}else{
					out.write("Case "+caso+": good\n");
				}
				caso++;
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
