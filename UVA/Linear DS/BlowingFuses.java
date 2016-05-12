import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BlowingFuses {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		StringTokenizer tk;
		long[] consumos;
		boolean[] encendido;
		int caso=1;
		while (linea!=null && !linea.equals("0 0 0")) {
			tk=new StringTokenizer(linea);
			int naparatos=Integer.parseInt(tk.nextToken());
			int noperaciones=Integer.parseInt(tk.nextToken());
			int capacidadFusible=Integer.parseInt(tk.nextToken());
			encendido=new boolean[naparatos];
			for (int i = 0; i < encendido.length; i++) {
				encendido[i]=false;
			}
			consumos=new long[naparatos];
			for (int i = 0; i < naparatos; i++) {
				consumos[i]=Long.parseLong(in.readLine());
			}
			long max=0;
			boolean estalloFusible=false;
			for (int i = 0; i < noperaciones; i++) {
				int index=Integer.parseInt(in.readLine());
				encendido[index-1]=!encendido[index-1];
				long consumo=0;
				for (int j = 0; j < naparatos; j++) {
					if (encendido[j]) {
						consumo+=consumos[j];
					}
					if (consumo>capacidadFusible) {
						estalloFusible=true;
					}else{
						if (consumo>max) {
							max=consumo;
						}
					}
				}
				
				
			}
			out.write("Sequence "+caso+"\n");
			if (!estalloFusible) {
				out.write("Fuse was not blown.\n");
				out.write("Maximal power consumption was "+max+" amperes.\n");
			}else{
				out.write("Fuse was blown.\n");
			}
			out.write("\n");
			caso++;
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
		
	}
	
}
