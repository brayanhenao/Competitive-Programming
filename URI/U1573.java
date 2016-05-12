import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U1573 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
	
		String linea;
		while((linea=in.readLine())!=null && !linea.equals("0 0 0"))
		{
			StringTokenizer tk=new StringTokenizer(linea);
			int a,b,c;
			a=Integer.parseInt(tk.nextToken());
			b=Integer.parseInt(tk.nextToken());
			c=Integer.parseInt(tk.nextToken());
			int mul=a*b*c;
			int resul=(int)Math.cbrt(mul);
			out.write(resul+"\n");
		}
		in.close();
		out.flush();
		out.close();
	}
	
	
}