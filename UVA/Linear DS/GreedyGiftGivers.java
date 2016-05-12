import java.io.*;
import java.util.StringTokenizer;

class GreedyGiftGivers {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea=in.readLine();
		StringTokenizer tk;
		String[] personas;
		double[] balancePersonas;
		while (linea!=null && !linea.equals("")) {
			int n=Integer.parseInt(linea);
			tk=new StringTokenizer(in.readLine());
			personas=new String[n];
			balancePersonas=new double[n];
			for (int i = 0; i < personas.length; i++) {
				personas[i]=tk.nextToken();
			}
			for (int i = 0; i < n; i++) {
				tk=new StringTokenizer(in.readLine());
				String nombre=tk.nextToken();
				int presupuesto=Integer.parseInt(tk.nextToken());
				balancePersonas[indexNombre(nombre, personas)]-=presupuesto;
				int nregalos=Integer.parseInt(tk.nextToken());
				for (int j = 0; j < nregalos; j++) {
					String ndestinatario=tk.nextToken();
					int index=indexNombre(ndestinatario, personas);
					balancePersonas[index]+=(presupuesto/nregalos);
				}
			}
			
			for (int i = 0; i < balancePersonas.length; i++) {
				out.write(personas[i]+" "+balancePersonas[i]+"\n");
			}
			
			out.write("\n");
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
		
	}
	
	public static int indexNombre(String nombre,String[]personas){
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
}
