package Introduction;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;
	
	class SearchingForNessy {
		public static void main(String[] args) throws IOException {
	
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
			String linea=in.readLine();
			
			while (linea!=null&& !linea.equals("")) {
				int casos=Integer.parseInt(linea);
				for (int i = 0; i < casos; i++) {
					
					StringTokenizer tk=new StringTokenizer(in.readLine());
					int n=Integer.parseInt(tk.nextToken());
					int m=Integer.parseInt(tk.nextToken());
					int n1=n/3;
					int m1=m/3;
					out.write(n1*m1+"\n");
				}
	
				linea=in.readLine();
			}
			in.close();
			out.flush();
			out.close();
		}
	}
