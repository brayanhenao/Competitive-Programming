import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class U1708 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
	
		String linea;
		while((linea=in.readLine())!=null )
		{
			StringTokenizer tk=new StringTokenizer(linea);
			int x=Integer.parseInt(tk.nextToken());
			int y=Integer.parseInt(tk.nextToken());
			int distancia1=0;
			int distancia2=0;
			int vuelta=1;
			while(true){
				if ((distancia2-distancia1)>=x) {
					break;
				}
				vuelta++;
				distancia1+=x;
				distancia2+=y;
			}
		
			
			out.write(vuelta+"\n");
		}
		in.close();
		out.flush();
		out.close();
	}
	
	
}