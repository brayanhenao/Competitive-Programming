import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class U1800 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while((s=in.readLine())!=null){
			StringTokenizer tk=new StringTokenizer(s);
			int n=Integer.parseInt(tk.nextToken());
			int m=Integer.parseInt(tk.nextToken());
			List lista=new ArrayList<>();
			tk=new StringTokenizer(in.readLine());
			while (tk.hasMoreElements()) {
				lista.add(tk.nextToken());
			}
			for (int i = 0; i < n; i++) {
				String office=in.readLine();
				if (lista.contains(office)) {
					out.write("0\n");
				}else{
					out.write("1\n");
					lista.add(office);
				}
			}
		
		}
		in.close();
		out.flush();
		out.close();
	}
}
