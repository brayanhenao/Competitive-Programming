import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class UVA12243 {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer tk;
		while(true){
			s=in.readLine();
			if(s.equals("*")){
				break;
			}
			tk=new StringTokenizer(s);
			int n=tk.countTokens();
			char c=tk.nextToken().toLowerCase().charAt(0);
			boolean puede=true;
			for(int i=0;i<n-1;i++){
				if(tk.nextToken().toLowerCase().charAt(0)!=c){
					puede=false;
					break;
				}
			}
			out.write(puede?"Y\n":"N\n");
		}
		
		in.close();
		out.close();
		
	}
}
