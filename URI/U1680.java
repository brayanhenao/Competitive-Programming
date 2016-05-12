import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class U1680 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea;
		int x,y,d,tamano;
		while ((linea=in.readLine())!=null) {
			d = 2;
			x=310;
			y=420;
			tamano=linea.length();
			out.write((x-10)+" "+y+" moveto\n");
			out.write(x+" "+y+" lineto\n");
			
			for (int i = 0; i < tamano; i++) {
				if (linea.charAt(i)=='V') {
					if(d == 0){
						x -= 10;
						d = 3;
					}else if(d == 1){
						x += 10;
						d = 2;
					}else if(d == 2){
						y += 10;
						d = 0;
					}else{
						y -= 10;
						d = 1;
					}
					
					out.write(x+" "+y+" lineto\n");
				}else{
					if(d == 0){
						x += 10;
						d = 2;
					}else if(d == 1){
						x -= 10;
						d = 3;
					}else if(d == 2){
						y -= 10;
						d = 1;
					}else{
						y += 10; 
						d = 0;
					}
					out.write(x+" "+y+" lineto\n");
				}
				
			}
			out.write("stroke\n");
			out.write("showpage\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}
