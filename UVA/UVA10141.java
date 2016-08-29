package Introduction;
import java.io.*;
import java.util.*;

class RequestForProposal {
		public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String linea=in.readLine();
		StringTokenizer tk;
		int rfp=1;
		while (linea!=null&& !linea.equals("0 0")) {
			if (rfp>1) {
				out.write("\n");
			}
			tk=new StringTokenizer(linea);
			int requeri=Integer.parseInt(tk.nextToken());
			int propuestas=Integer.parseInt(tk.nextToken());
			String[] requerimientos=new String[requeri];
			for (int i = 0; i < requeri; i++) {
				requerimientos[i]=in.readLine();
			}
			
			PriorityQueue<Propuesta> propues=new PriorityQueue<>(propuestas, new Comparator<Propuesta>() {

				@Override
				public int compare(Propuesta o1, Propuesta o2) {
					if (o1.cumplimiento==o2.cumplimiento) {
						if (o1.precio==o2.precio) {
							return Integer.compare(o1.id, o2.id);
						}else{
							return Double.compare(o1.precio, o2.precio);
						}
					}else{
						return Double.compare(o2.cumplimiento, o1.cumplimiento);
					}
				}
			});
			
			for (int i = 0; i < propuestas; i++) {
				String nombre=in.readLine();
				tk=new StringTokenizer(in.readLine());
				double precio=Double.parseDouble(tk.nextToken());
				int numeroRequeri=Integer.parseInt(tk.nextToken());
				int count = 0;
			        for (int j = 0; j < numeroRequeri; j++) {
			          in.readLine();
			          count++;
			        }
				propues.add(new Propuesta(i	, nombre, precio, count));
			
			}
		
			out.write("RFP #"+rfp+"\n");
			out.write(propues.poll().nombre+"\n");
			rfp++;
			linea=in.readLine();
		}
		in.close();
		out.flush();
		out.close();
	}
	
		public static class Propuesta {
		int id;
		String nombre;
		double precio;
		double cumplimiento;
		
		public Propuesta(int id,String nombre,double precio,double cumplimiento){
			this.id=id;
			this.nombre=nombre;
			this.precio=precio;
			this.cumplimiento=cumplimiento;		
		}
	}
}
