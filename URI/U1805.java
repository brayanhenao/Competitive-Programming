
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class U1805 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		long a,b,r;
		StringTokenizer tk;
		while((s=in.readLine())!=null){
			tk=new StringTokenizer(s);
			a=Long.parseLong(tk.nextToken());
			b=Long.parseLong(tk.nextToken());
			r=(a + b) * ((b - a) + 1)/2;
			out.write(r+"\n");
		}
		in.close();
		out.flush();
		out.close();
	}

}
