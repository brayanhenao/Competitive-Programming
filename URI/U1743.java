import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class U1743 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		int a[],b[];
		while((s=in.readLine())!=null){
			a=new int[5];
			b=new int[5];
			StringTokenizer tk=new StringTokenizer(s);		
			for (int i = 0; i < b.length; i++) {
				a[i]=Integer.parseInt(tk.nextToken());
			}
			tk=new StringTokenizer(in.readLine());
			for (int i = 0; i < b.length; i++) {
				b[i]=Integer.parseInt(tk.nextToken());
			}
			boolean repetido=false;
			for (int i = 0; i < b.length; i++) {
				if(a[i]==b[i])
					repetido=true;
			}
			
			out.write((repetido)?"N\n":"Y\n");
			
		}
		in.close();
		out.flush();
		out.close();
	}
}
