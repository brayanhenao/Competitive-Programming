
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class U1308 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		double n,x,r;
		while((s=in.readLine())!=null){
			n=Integer.parseInt(s);
			for (int i = 0; i < n; i++) {
				x=Double.parseDouble(in.readLine());
				r=(Math.sqrt(1+8*x)-1)/2;
				out.write((int)r+"\n");
			}
			
		}
		in.close();
		out.flush();
		out.close();
	}

}
