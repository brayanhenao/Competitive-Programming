package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class ClockHands {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		while (linea!=null && !linea.equals("0:00")) {
			StringTokenizer tk=new StringTokenizer(linea, ":");
			int hora=Integer.parseInt(tk.nextToken());
			int minutos=Integer.parseInt(tk.nextToken());
			
			double anguloHora = 0.5 * (60 * hora +minutos);
			double anguloMinutos =6*  minutos;
			double angulo=Math.abs(anguloHora-anguloMinutos);
			if (angulo>180) {
				angulo=360-angulo;
			}
			
			
			System.out.printf("%.3f\n", angulo);
			linea=in.readLine();
		}
		
		
		in.close();
		out.flush();
		out.close();
	}
}
