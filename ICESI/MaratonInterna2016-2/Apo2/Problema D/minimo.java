import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class minimo {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader( System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int casos = Integer.parseInt(in.readLine());
		
		while(casos>0){
			
			int n = Integer.parseInt(in.readLine());
			int[] v1 = new int[n];
			int[] v2 = new int[n];
			StringTokenizer a1 = new StringTokenizer( in.readLine());
			int cont = 0;
			while(a1.hasMoreTokens()){
				v1[cont] = Integer.parseInt(a1.nextToken());
				cont++;
			}
			a1 = new StringTokenizer( in.readLine());
			cont = 0;
			while(a1.hasMoreTokens()){
				v2[cont] = Integer.parseInt(a1.nextToken());
				cont++;
			}
			Arrays.sort(v1);
			Arrays.sort(v2);
			
			int answ = 0;
			for(int i=0; i<v1.length;i++){
				answ+= v1[i]*v2[v2.length-1-i];
			}
			out.write(answ+"\n");
			casos--;
		}
		out.flush();
	}
	
	
}
