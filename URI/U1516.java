import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U1516 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		char[][] matriz=new char[101][101];
		String linea;
		while((linea=in.readLine())!=null && !linea.equals("0 0"))
		{
			StringTokenizer tk=new StringTokenizer(linea);
			int n=Integer.parseInt(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			for (int i = 0; i < n;i++) {
				String lin=in.readLine();
				for (int j = 0; j < m; j++) {
					matriz[i][j]=lin.charAt(j);
				}
			}
			tk=new StringTokenizer(in.readLine());
			int a=Integer.parseInt(tk.nextToken());
			int b=Integer.parseInt(tk.nextToken());
			for (int i = 0; i <n ; i++) {
				for (int j = 0; j <(a/n) ; j++) {
					for (int k = 0; k <m ; k++) {
						for (int l= 0; l <(b/m) ; l++) {
							out.write(matriz[i][k]);
						}
					}
					out.write("\n");
				}
			}
			
			out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}
	
	
}