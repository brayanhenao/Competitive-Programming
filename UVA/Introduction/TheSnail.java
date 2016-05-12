package Introduction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class TheSnail{
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea = in.readLine();
		while (linea != null && !linea.equals("")) {
			StringTokenizer tk = new StringTokenizer(linea);
			double altura=Double.parseDouble(tk.nextToken());   
			double distanciaEscalada=Double.parseDouble(tk.nextToken());
			double distanciaDesliza=Double.parseDouble(tk.nextToken());
			double fatiga=Double.parseDouble(tk.nextToken());
			if (altura==0) {
				break;
			}
			double disminucion=distanciaEscalada*(fatiga *1 /100);
			double altura2=0;
			int dia=0;
			boolean escalo=true;
			while (true) {
				dia++;
				altura2+=distanciaEscalada;
				if (altura2>altura) {
					break;
				}
				altura2-=distanciaDesliza;
				if (altura2==0.0) {
					escalo=false;
					break;
				}
				if (distanciaEscalada-disminucion >0.0) {
					distanciaEscalada-=disminucion;
				}else{
					distanciaEscalada=0;
				}
				
			}
			if (escalo) {
				System.out.println("succes on day "+dia);
			}else{
				System.out.println("failure on day "+dia);
			}
			
			linea=in.readLine();
		}

		in.close();
		out.flush();
		out.close();
	}
}
