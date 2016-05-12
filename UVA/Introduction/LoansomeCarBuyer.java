package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class LoansomeCarBuyer {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		StringTokenizer tk;
		while (linea!=null&& !linea.equals("")) {
			tk=new StringTokenizer(linea);
			int meses=Integer.parseInt(tk.nextToken());
			if (meses<0) {
				break;
			}
			double cuotaInicial=Double.parseDouble(tk.nextToken());
			double prestamo=Double.parseDouble(tk.nextToken());
			int ndepreciaciones=Integer.parseInt(tk.nextToken());
			int[] añosDepreciacion=new int[ndepreciaciones];
			double[] valorDepreciaciones=new double[ndepreciaciones];
			for (int i = 0; i < ndepreciaciones; i++) {
				tk=new StringTokenizer(in.readLine());
				añosDepreciacion[i]=Integer.parseInt(tk.nextToken());
				valorDepreciaciones[i]=Double.parseDouble(tk.nextToken());
			}
			
			
			
			
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	
	public static void simularPrestamo(int meses,double cuotaInicial,double prestamo,
			double[]valoresDepreciaciones){
		double valorCarro=cuotaInicial+prestamo;
		
	}
}
