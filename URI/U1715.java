import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class U1715 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		
		while((s=in.readLine())!=null){
		StringTokenizer tk=new StringTokenizer(s);
		int jugadores=Integer.parseInt(tk.nextToken());
		int juegos=Integer.parseInt(tk.nextToken());
		int resultado=0;
		for (int i = 0; i < jugadores; i++) {
			tk=new StringTokenizer(in.readLine());
			int temporal=0;
			for (int j = 0; j < juegos; j++) {
				if (Integer.parseInt(tk.nextToken())>0) {
					temporal++;
				}
			}
			if (temporal==juegos) {
				resultado++;
			}
		}
		out.write(resultado+"\n");
		}
		in.close();
		out.flush();
		out.close();
	}
}
