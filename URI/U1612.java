import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class U1612 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while((s=in.readLine())!=null){
			int n=Integer.parseInt(s);
			for (int i = 0; i < n; i++) {
				double num=Double.parseDouble(in.readLine());
				out.write((int)Math.ceil(num/2)+"\n");
			}
			
		}
		in.close();
		out.flush();
		out.close();
	}
}
