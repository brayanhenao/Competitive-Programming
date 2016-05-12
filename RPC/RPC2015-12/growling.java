import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


public class growling {
	
	public static double resul(double a, double b, double c, double r){
		return 	(-a*(r*r))+(b*r)+c;
	}
	
	
	
	public static double rpm(double b, double a){
		return b/(2*a);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		
		while (linea!=null &&!linea.equals("")) {
			int n=Integer.parseInt(linea);
			
			for(int i = 0; i < n; i++) {
				int con=Integer.parseInt(in.readLine());
				double res=0;
				int iden=0;
				for (int j = 0; j < con; j++) {
					StringTokenizer tk=new StringTokenizer(in.readLine()," ");
					double a=Double.parseDouble(tk.nextToken());
					double b=Double.parseDouble(tk.nextToken());
					double c=Double.parseDouble(tk.nextToken());
					double rpm=rpm(b, a);
					double res2=resul(a, b, c, rpm);
					if (res2>res) {
						res=res2;
						iden=j+1;
					}
				}
				out.write(iden+"\n");
			}
			linea=in.readLine();
		}
		
		in.close();
		out.flush();
		out.close();
	}
}
