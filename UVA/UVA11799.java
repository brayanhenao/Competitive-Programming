package Introduction;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class HorrorDash{
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		int caso;
		while (linea != null && !linea.equals("")) {
			caso=1;
			int num = Integer.parseInt(linea);
			for (int i = 0; i < num; i++) {
				StringTokenizer tk=new StringTokenizer(in.readLine());
				int estu=Integer.parseInt(tk.nextToken());
				int[] estudiantes=new int[estu];
				for (int j = 0; j < estu; j++) {
					estudiantes[j]=Integer.parseInt(tk.nextToken());
				}
				Arrays.sort(estudiantes);
				
				out.write("Case "+caso+": "+estudiantes[estudiantes.length-1]+"\n");
				caso++;
				
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}

	
}
