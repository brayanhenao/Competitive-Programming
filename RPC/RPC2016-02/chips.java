import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class chips {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		while (linea!=null && !linea.equals("")) {
			int cesta=0;
			int bill=0;
			int ted=0;
			int comeTed=0;
			int comeBill=0;
			StringTokenizer tk=new StringTokenizer(linea);
			cesta=Integer.parseInt(tk.nextToken());
			int sacaBill=Integer.parseInt(tk.nextToken());
			int sacaTed=Integer.parseInt(tk.nextToken());
			while (cesta!=0) {
				if (bill==0 && ted==0) {
					if (cesta>=sacaBill) {
						cesta-=sacaBill;
						bill+=sacaBill;
					}else{
						bill+=cesta;
						cesta=0;
					}
					if (cesta>=sacaTed) {
						cesta-=sacaTed;
						ted+=sacaTed;
					}else{
						ted+=cesta;
						cesta=0;
					}
					
					
				}else if(bill==0 && ted>0){
					if (cesta>=sacaBill) {
						cesta-=sacaBill;
						bill+=sacaBill;
					}else{
						bill+=cesta;
						cesta=0;
					}
					ted--;
					comeTed++;
				}else if(ted==0 && bill>0){
					if (cesta>=sacaTed) {
						cesta-=sacaTed;
						ted+=sacaTed;
					}else{
						ted+=cesta;
						cesta=0;
					}
					bill--;
					comeBill++;
				}else if(ted>0 && bill>0){
					bill--;
					comeBill++;
					ted--;
					comeTed++;
				}
			}
			comeBill+=bill;
			comeTed+=ted;
			out.write(comeBill+" "+comeTed+"\n");
			linea=in.readLine();
		}
		
		in.close();
		out.flush();
		out.close();
	}
	
}
