import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class U1457 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while((s=in.readLine())!=null){
			int n=Integer.parseInt(s);
			for (int i = 0; i < n; i++) {
				String str=in.readLine();
				String num="";
				int k=0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j)=='!') {
						k++;
					}else{
						num+=str.charAt(j);
					}
				}
				int numer=Integer.parseInt(num);
				long sum=numer;
				for (int j = 1; numer - (j * k) >= 1; j++) {
					sum*=(numer-(j*k));
				}
				out.write(sum+"\n");
				
			}
		}
		in.close();
		out.flush();
		out.close();
	}
}
