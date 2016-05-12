import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class U1921 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		long a,r;
		while((s=in.readLine())!=null){
			a=Long.parseLong(s);
			r=(a*(a-3))>>1;
			out.write(r+"\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}
