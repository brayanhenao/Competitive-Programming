package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class TariffPlan {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		int[] minutos;
		StringTokenizer tk;
		int caso=1;
		while (linea!=null&& !linea.equals("")) {
			int n=Integer.parseInt(linea);
			for (int i = 0; i < n; i++) {
				int llamadas=Integer.parseInt(in.readLine());
				minutos=new int[llamadas];
				tk=new StringTokenizer(in.readLine());
				for (int j = 0; j < minutos.length; j++) {
					minutos[j]=Integer.parseInt(tk.nextToken());
				}
				int pJuice=precioJuice(minutos);
				int pMile=precioMile(minutos);
				
				if (pJuice==pMile) {
					out.write("Case "+caso+": Mile Juice "+pMile+"\n");
				}else if (pJuice>pMile) {
					out.write("Case "+caso+": Mile "+pMile+"\n");
				}else{
					out.write("Case "+caso+": Juice "+pJuice+"\n");
				}
				caso++;
			}
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	public static int precioMile(int[] minutos){
		int sum=0;
		for (int i = 0; i < minutos.length; i++) {
			sum+=Math.ceil(minutos[i]/30.0)*10;
			if (minutos[i]%30==0) {
				sum+=10;
			}
		}
		return sum;
	}
	public static int precioJuice(int[] minutos){
		int sum=0;
		for (int i = 0; i < minutos.length; i++) {
			sum+=Math.ceil(minutos[i]/60.0)*15;
			if (minutos[i]%60==0) {
				sum+=15;
			}
		}
		
		return sum;
	}
}
