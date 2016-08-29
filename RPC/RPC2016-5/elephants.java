import java.util.*;
import java.io.*;

public class elephants {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		StringTokenizer tk;
		int m,w,n;
		int pesos[];
		while (linea!=null && !linea.equals("")) {
			n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				tk=new StringTokenizer(in.readLine());
				m=Integer.parseInt(tk.nextToken());
				w=Integer.parseInt(tk.nextToken());
				pesos=new int[m];
				tk=new StringTokenizer(in.readLine());
				for (int j = 0; j < m; j++) {
					pesos[j]=Integer.parseInt(tk.nextToken());
				}
				Arrays.sort(pesos);
				int total=0;
				ArrayList<Integer> ele=new ArrayList<>();
				for(int j=0;j<m;j++){
					if(total+pesos[j]>w){
						break;
					}else{
						total+=pesos[j];
						ele.add(1);
					}
				}
				out.write((ele.size())+"\n");
			}
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
}
